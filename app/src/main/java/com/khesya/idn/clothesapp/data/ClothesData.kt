package com.khesya.idn.clothesapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ClothesData (
    var clothes: String = " ",
    var price: String = " ",
    var detail: String = " ",
    var photo: Int = 0,
) : Parcelable