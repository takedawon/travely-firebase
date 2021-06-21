package com.lanic.travely.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.lanic.travely.R
import com.lanic.travely.base.BaseFragment
import com.lanic.travely.data.RegisterData
import com.lanic.travely.databinding.FragmentLoginBinding
import com.lanic.travely.databinding.FragmentRegisterEmailBinding
import com.lanic.travely.utils.EventObserver
import com.lanic.travely.utils.isCheckEmail

class RegisterEmailFragment : BaseFragment<FragmentRegisterEmailBinding>(
    layoutId = R.layout.fragment_register_email
) {

    private val viewModel: RegisterEmailViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel

        viewModel.goToInputNickname.observe(viewLifecycleOwner, EventObserver {
            val registerData = RegisterData(email = viewModel.getUserEmail())
            val action =
                RegisterEmailFragmentDirections.actionToRegisterNickname(registerData)
            findNavController().navigate(action)
        })

        viewModel.email.observe(viewLifecycleOwner, Observer { email ->
            with(binding.tilEmail) {
                if (email.isNotEmpty() && isCheckEmail(email).not()) {
                    error = "이메일 형식과 일치하지 않습니다."
                } else {
                    error = ""
                    isErrorEnabled = false
                }
            }
        })
    }
}