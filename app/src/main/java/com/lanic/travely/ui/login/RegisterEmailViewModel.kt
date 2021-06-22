package com.lanic.travely.ui.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.firebase.firestore.FirebaseFirestore
import com.lanic.travely.base.BaseViewModel
import com.lanic.travely.utils.Event
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch

class RegisterEmailViewModel : BaseViewModel() {

    private val _goToInputNickname = MutableLiveData<Event<Unit>>()
    val goToInputNickname: LiveData<Event<Unit>> = _goToInputNickname

    val email: MutableLiveData<String> = MutableLiveData("")

    private val db: FirebaseFirestore by lazy {
        FirebaseFirestore.getInstance()
    }

    fun checkEmail(email: String) {
        db.collection("user")
            .whereEqualTo("email", email)
            .get()
            .addOnSuccessListener {
                for (document in it.documents) {
                    Log.d("test", "${document.id} => ${document.data}")
                }
            }
            .addOnFailureListener {
                Log.w("test", "Error getting documents: ", it)
            }
    }


    fun goToInputNickname() {
        _goToInputNickname.value = Event(Unit)
    }

    fun getUserEmail(): String = email.value ?: ""
}