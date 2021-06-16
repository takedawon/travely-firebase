package com.lanic.travely

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.lanic.travely.databinding.ItemMainPostBinding

class HomePostAdapter :
    ListAdapter<DummyHomeData, MainViewHolder>(object : DiffUtil.ItemCallback<DummyHomeData>() {
        override fun areItemsTheSame(oldItem: DummyHomeData, newItem: DummyHomeData): Boolean {
            return oldItem.nickname == newItem.nickname
        }

        override fun areContentsTheSame(oldItem: DummyHomeData, newItem: DummyHomeData): Boolean {
            return oldItem == newItem
        }
    }) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_main_post, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class MainViewHolder(val binding: ItemMainPostBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(postData: DummyHomeData) {
        binding.postData = postData
    }
}

data class DummyHomeData(
    val profileUrl: String = "https://mblogthumb-phinf.pstatic.net/MjAxODA5MTRfMzQg/MDAxNTM2ODgxNzA5MjQ3.Dczu9sx41LSz443BAzIWlhyGGJLp1xHTTmXcVjrcRn8g.trPmx1hnXRMqLbFPchSSvXAjuKngzMJ9l8c8mk_-ILIg.PNG.catlovercat/20180913_133014.png?type=w800",
    val nickname: String = "",
    val destinationName: String = "",
    val content: String = "",
    val url: String = "https://cdn.pixabay.com/photo/2014/01/02/10/09/sea-237486__480.jpg"
)