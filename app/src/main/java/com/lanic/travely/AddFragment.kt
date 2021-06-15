package com.lanic.travely

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.lanic.travely.base.BaseFragment
import com.lanic.travely.databinding.FragmentAddBinding
import com.lanic.travely.databinding.FragmentHomeBinding

class AddFragment : BaseFragment<FragmentAddBinding>(
    layoutId = R.layout.fragment_add
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}