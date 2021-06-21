package com.lanic.travely.utils

import android.util.Patterns
import java.util.regex.Pattern

fun isCheckEmail(text: String): Boolean {
    val pattern = Patterns.EMAIL_ADDRESS
    return pattern.matcher(text).matches()
}

