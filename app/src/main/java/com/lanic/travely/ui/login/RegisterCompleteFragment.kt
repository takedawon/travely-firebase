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
import com.lanic.travely.databinding.FragmentRegisterBirthBinding
import com.lanic.travely.databinding.FragmentRegisterCompleteBinding
import com.lanic.travely.databinding.FragmentRegisterNicknameBinding
import com.lanic.travely.utils.EventObserver

class RegisterCompleteFragment : BaseFragment<FragmentRegisterCompleteBinding>(
    layoutId = R.layout.fragment_register_complete
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvComplete.setOnClickListener {
            requireActivity().finish()
        }
    }

}