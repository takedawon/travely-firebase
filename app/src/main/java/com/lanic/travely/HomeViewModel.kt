package com.lanic.travely

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.lanic.travely.base.BaseViewModel
import com.lanic.travely.data.PostData

class HomeViewModel : BaseViewModel() {
    private val db = Firebase.firestore

    private val _postData = MutableLiveData<List<PostData>>()
    val postData: LiveData<List<PostData>> = _postData

    fun getPostData() {
        db.collection(POST)
            .get()
            .addOnSuccessListener { documentSnapshot ->
                documentSnapshot.toObjects<PostData>()
            }
            .addOnFailureListener {

            }
    }
}