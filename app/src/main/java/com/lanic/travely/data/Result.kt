package com.lanic.travely.data

sealed class Result {
    object Success : Result()
    object Failed : Result()
    object Loading : Result()
}
