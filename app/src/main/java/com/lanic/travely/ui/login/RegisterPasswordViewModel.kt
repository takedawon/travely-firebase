package com.lanic.travely.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
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

    private val auth: FirebaseAuth by lazy {
        FirebaseAuth.getInstance()
    }

    private val db: FirebaseFirestore by lazy {
        FirebaseFirestore.getInstance()
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
                saveUserData(registerData)
            }
            .addOnFailureListener {
                _state.value = Result.Failed
            }
    }

    private fun saveUserData(userData: RegisterData) {
        db.collection("user")
            .document(auth.uid!!)
            .set(mapOf("email" to userData.email, "nickname" to userData.nickname, "birth" to userData.birth))
    }
}