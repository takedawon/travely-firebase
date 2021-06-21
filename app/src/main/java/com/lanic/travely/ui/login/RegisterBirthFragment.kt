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
import com.lanic.travely.databinding.FragmentRegisterBirthBinding
import com.lanic.travely.databinding.FragmentRegisterNicknameBinding
import com.lanic.travely.utils.EventObserver

class RegisterBirthFragment : BaseFragment<FragmentRegisterBirthBinding>(
    layoutId = R.layout.fragment_register_birth
) {

    val viewModel:RegisterBirthViewModel by viewModels()

    val args: RegisterBirthFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.vm = viewModel

        viewModel.goToPasswordInput.observe(viewLifecycleOwner, EventObserver {
            val registerData = args.registerData.apply {
                birth = viewModel.getBirth()
            }
            findNavController().navigate(RegisterBirthFragmentDirections.actionToRegisterPassword(registerData))
        })

    }

}