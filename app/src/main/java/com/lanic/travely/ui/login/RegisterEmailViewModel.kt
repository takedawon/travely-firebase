package com.lanic.travely.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.lanic.travely.base.BaseViewModel
import com.lanic.travely.utils.Event

class RegisterEmailViewModel:BaseViewModel() {

    private val _goToInputEmail = MutableLiveData<Event<Unit>>()
    val goToInputEmail : LiveData<Event<Unit>> = _goToInputEmail

    fun goToInputEmail() {
        _goToInputEmail.value = Event(Unit)
    }
}