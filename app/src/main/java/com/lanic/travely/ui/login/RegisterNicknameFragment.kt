package com.lanic.travely.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.lanic.travely.R
import com.lanic.travely.base.BaseFragment
import com.lanic.travely.databinding.FragmentLoginBinding
import com.lanic.travely.databinding.FragmentRegisterNicknameBinding
import com.lanic.travely.utils.EventObserver

class RegisterNicknameFragment : BaseFragment<FragmentRegisterNicknameBinding>(
    layoutId = R.layout.fragment_register_nickname
) {

    private val viewModel: RegisterNicknameViewModel by viewModels()

    val args: RegisterNicknameFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel

        viewModel.goToInputBirth.observe(viewLifecycleOwner, EventObserver {
            val registerData = args.registerData.apply {
                nickname = viewModel.getNickname()
            }
            findNavController().navigate(RegisterNicknameFragmentDirections.actionToRegisterBirth(registerData))
        })
    }
}