package com.lanic.travely.data

data class PostData(
    val nickname: String,
    val destination: String,
    val photoUrlList: ArrayList<String>
    val content: String,
    val commentCount: Int,
    val likeCount: Int
)