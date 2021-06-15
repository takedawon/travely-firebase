package com.lanic.travely

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.lanic.travely.base.BaseFragment
import com.lanic.travely.databinding.FragmentHomeBinding
import com.lanic.travely.databinding.FragmentSearchBinding

class SearchFragment : BaseFragment<FragmentSearchBinding>(
    layoutId = R.layout.fragment_search
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}