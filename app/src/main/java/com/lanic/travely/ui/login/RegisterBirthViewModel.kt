package com.lanic.travely.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.lanic.travely.base.BaseViewModel
import com.lanic.travely.utils.Event

class RegisterBirthViewModel : BaseViewModel() {

    private val _goToPasswordInput = MutableLiveData<Event<Unit>>()
    val goToPasswordInput: LiveData<Event<Unit>> = _goToPasswordInput

    val birth: MutableLiveData<String> = MutableLiveData()

    fun onGoToPasswordInput() {
        _goToPasswordInput.value = Event(Unit)
    }

    fun getBirth(): String = birth.value ?: ""
}