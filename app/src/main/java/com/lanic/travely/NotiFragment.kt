package com.lanic.travely

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.lanic.travely.base.BaseFragment
import com.lanic.travely.databinding.FragmentHomeBinding
import com.lanic.travely.databinding.FragmentNotiBinding
import com.lanic.travely.databinding.FragmentSearchBinding

class NotiFragment : BaseFragment<FragmentNotiBinding>(
    layoutId = R.layout.fragment_noti
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}