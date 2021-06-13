package com.lanic.travely

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.lanic.travely.base.BaseFragment
import com.lanic.travely.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(
    layoutId = R.layout.fragment_home
) {

    private val viewController by lazy {
        MainPostEpoxyController()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            rvMain.adapter = viewController.adapter
            rvMain.layoutManager = LinearLayoutManager(requireContext())
        }
    }
}