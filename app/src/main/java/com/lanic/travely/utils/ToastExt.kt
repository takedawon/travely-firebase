package com.lanic.travely.utils

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.toast(msg: String) {
    Toast.makeText(this.context, msg, Toast.LENGTH_SHORT).show()
}