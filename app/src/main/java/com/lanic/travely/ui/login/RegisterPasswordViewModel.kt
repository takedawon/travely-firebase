package com.lanic.travely.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseAuth
import com.lanic.travely.R
import com.lanic.travely.base.BaseViewModel
import com.lanic.travely.data.RegisterData
import com.lanic.travely.data.Result
import com.lanic.travely.utils.Event

class RegisterPasswordViewModel : BaseViewModel() {

    private val _joinComplete = MutableLiveData<Event<Unit>>()
    val joinComplete: LiveData<Event<Unit>> = _joinComplete

    val password: MutableLiveData<String> = MutableLiveData()
    val passwordConfirm: MutableLiveData<String> = MutableLiveData()

    private val _state = MutableLiveData<Result>()
    val state: LiveData<Result> = _state

    val auth: FirebaseAuth by lazy {
        FirebaseAuth.getInstance()
    }

    lateinit var registerData: RegisterData

    fun onJoinComplete() {
        _joinComplete.value = Event(Unit)
    }

    fun getUserPassword(): String = password.value ?: ""

    fun isEqualPassword(): Boolean = password.value == passwordConfirm.value

    fun setRegisterUserData(registerData: RegisterData) {
        this.registerData = registerData
    }

    fun signUp() {
        auth.createUserWithEmailAndPassword(registerData.email, registerData.password)
            .addOnSuccessListener {
                _state.value = Result.Success
            }
            .addOnFailureListener {
                _state.value = Result.Failed
            }
    }
}