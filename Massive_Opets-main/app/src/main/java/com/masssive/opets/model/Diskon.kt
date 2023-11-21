package com.masssive.opets.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class diskon(
    val photo: Int,
    val nama:String
): Parcelable
