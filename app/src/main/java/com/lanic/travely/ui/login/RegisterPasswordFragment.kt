package com.lanic.travely.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.firebase.auth.FirebaseAuth
import com.lanic.travely.R
import com.lanic.travely.base.BaseFragment
import com.lanic.travely.data.Result
import com.lanic.travely.databinding.FragmentLoginBinding
import com.lanic.travely.databinding.FragmentRegisterNicknameBinding
import com.lanic.travely.databinding.FragmentRegisterPasswordBinding
import com.lanic.travely.utils.EventObserver
import com.lanic.travely.utils.toast

class RegisterPasswordFragment : BaseFragment<FragmentRegisterPasswordBinding>(
    layoutId = R.layout.fragment_register_password
) {

    private val viewModel: RegisterPasswordViewModel by viewModels()

    private val passArgs: RegisterPasswordFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel

        viewModel.loading.observe(viewLifecycleOwner, EventObserver {

        })

        viewModel.state.observe(viewLifecycleOwner, Observer {
            when (it) {
                Result.Success -> {
                    findNavController().navigate(R.id.action_to_registerComplete)
                }
                Result.Failed -> {
                    toast("회원가입이 실패하였습니다.")
                }
            }

        })

        viewModel.joinComplete.observe(viewLifecycleOwner, EventObserver {
            if (viewModel.isEqualPassword()) {
                val registerData = passArgs.registerData.apply {
                    password = viewModel.getUserPassword()
                }
                viewModel.setRegisterUserData(registerData)
                viewModel.signUp()
            }
        })
    }
}