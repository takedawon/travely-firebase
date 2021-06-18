package com.lanic.travely.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.lanic.travely.base.BaseViewModel
import com.lanic.travely.utils.Event

class LoginViewModel : BaseViewModel() {

    private val _goToRegister = MutableLiveData<Event<Unit>>()
    val goToRegister: LiveData<Event<Unit>> = _goToRegister

    fun goToRegisterSelect() {
        _goToRegister.value = Event(Unit)
    }
}