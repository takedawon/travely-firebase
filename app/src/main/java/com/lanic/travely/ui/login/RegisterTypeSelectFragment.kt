package com.lanic.travely.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.lanic.travely.R
import com.lanic.travely.base.BaseFragment
import com.lanic.travely.databinding.FragmentLoginBinding
import com.lanic.travely.databinding.FragmentRegisterTypeSelectBinding
import com.lanic.travely.utils.EventObserver

class RegisterTypeSelectFragment : BaseFragment<FragmentRegisterTypeSelectBinding>(
    layoutId = R.layout.fragment_register_type_select
) {

    private val viewModel: RegisterTypeSelectViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel

        viewModel.goToInputEmail.observe(viewLifecycleOwner, EventObserver {
            findNavController().navigate(R.id.action_to_registerEmail)
        })
    }

}