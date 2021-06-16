package com.lanic.travely.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter(value = ["setUrl"])
fun ImageView.setUrl(url: String?) {
    Glide.with(this.context)
        .load(url)
        .into(this)
}