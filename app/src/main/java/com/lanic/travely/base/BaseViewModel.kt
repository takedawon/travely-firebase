package com.lanic.travely.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lanic.travely.utils.Event

abstract class BaseViewModel:ViewModel() {

    private val _loading = MutableLiveData<Event<Boolean>>()
    val loading : LiveData<Event<Boolean>> = _loading
}