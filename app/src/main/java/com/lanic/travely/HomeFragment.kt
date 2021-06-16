package com.lanic.travely

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.lanic.travely.base.BaseFragment
import com.lanic.travely.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(
    layoutId = R.layout.fragment_home
) {

    private val homePostAdapter: HomePostAdapter by lazy { HomePostAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            with(rvMain) {
                layoutManager = LinearLayoutManager(requireContext())
                adapter = homePostAdapter
            }
        }
        homePostAdapter.submitList(listOf(DummyHomeData("라닉", "경기도", "우왕조아따"), DummyHomeData("라닉", "경기도", "우왕조아따")))

    }
}