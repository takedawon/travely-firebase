package com.lanic.travely.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.lanic.travely.base.BaseViewModel
import com.lanic.travely.utils.Event

class RegisterPasswordViewModel:BaseViewModel() {

    private val _joinComplete = MutableLiveData<Event<Unit>>()
    val joinComplete : LiveData<Event<Unit>> = _joinComplete

    fun onJoinComplete() {
        _joinComplete.value = Event(Unit)
    }
}