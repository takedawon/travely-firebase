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
        homePostAdapter.submitList(
            listOf(
                DummyHomeData(
                    "https://mblogthumb-phinf.pstatic.net/MjAxODA5MTRfMzQg/MDAxNTM2ODgxNzA5MjQ3.Dczu9sx41LSz443BAzIWlhyGGJLp1xHTTmXcVjrcRn8g.trPmx1hnXRMqLbFPchSSvXAjuKngzMJ9l8c8mk_-ILIg.PNG.catlovercat/20180913_133014.png?type=w800",
                    "라닉",
                    "경기도",
                    "우왕조아따",
                    "https://cdn.gukjenews.com/news/photo/202001/1228495_1008800_1059.png"
                ),
                DummyHomeData(
                    "https://mblogthumb-phinf.pstatic.net/MjAxODA5MTRfMzQg/MDAxNTM2ODgxNzA5MjQ3.Dczu9sx41LSz443BAzIWlhyGGJLp1xHTTmXcVjrcRn8g.trPmx1hnXRMqLbFPchSSvXAjuKngzMJ9l8c8mk_-ILIg.PNG.catlovercat/20180913_133014.png?type=w800",

                    "라닉",
                    "경기도",
                    "우왕조아따",
                    "https://cdn.pixabay.com/photo/2014/01/02/10/09/sea-237486__480.jpg"
                )
            )
        )

    }
}