package com.lanic.travely.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.lanic.travely.base.BaseViewModel
import com.lanic.travely.utils.Event

class RegisterNicknameViewModel : BaseViewModel() {

    private val _goToInputBirth = MutableLiveData<Event<Unit>>()
    val goToInputBirth: LiveData<Event<Unit>> = _goToInputBirth

    fun goToInputBirth() {
        _goToInputBirth.value = Event(Unit)
    }
}