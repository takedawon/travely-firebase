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
        holder.bind()
    }
}

class MainViewHolder(val binding: ItemMainPostBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind() {

    }
}

data class DummyHomeData(val nickname: String = "", val destinationName: String = "", val content: String = "")