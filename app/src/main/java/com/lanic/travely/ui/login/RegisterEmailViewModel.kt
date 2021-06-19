package com.lanic.travely.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.lanic.travely.base.BaseViewModel
import com.lanic.travely.utils.Event

class RegisterEmailViewModel:BaseViewModel() {

    private val _goToInputNickname = MutableLiveData<Event<Unit>>()
    val goToInputNickname : LiveData<Event<Unit>> = _goToInputNickname

   val email = MutableLiveData("")

    fun goToInputNickname() {
        _goToInputNickname.value = Event(Unit)
    }
}