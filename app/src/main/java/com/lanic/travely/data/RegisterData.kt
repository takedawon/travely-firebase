package com.lanic.travely.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RegisterData(
    var email: String = "",
    var password: String = "",
    var nickname: String = "",
    var birth: String = ""
) : Parcelable