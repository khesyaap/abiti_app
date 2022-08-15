package com.khesya.idn.clothesapp.data

import com.khesya.idn.clothesapp.R

object ClothesDataObject {

    private val clothess = arrayOf(
        "Black Jacket",
        "Dress Brown",
        "Knit Cardigan",
        "Knit Jacket",
        "One Set Summer 1",
        "One Set Summer 2",
        "Shirt White",
        "Sweater Knit",
        "Sweater Navy",
        "Vest Navy",
    )
    private val clothesPrice = arrayOf(
        "Rp 150.000",
        "Rp 245.000",
        "Rp 135.000",
        "Rp 180.000",
        "Rp 570.000",
        "Rp 610.000",
        "Rp 230.000",
        "Rp 320.000",
        "Rp 140.000",
        "Rp 220.000",
    )
    private val clothesDetails = arrayOf(
        "Berbahan lembut, tidak panas saat dipakai siang hari",
        "Berbahan lembut, tidak panas saat dipakai siang hari",
        "Berbahan lembut, tidak panas saat dipakai siang hari",
        "Berbahan lembut, tidak panas saat dipakai siang hari",
        "Berbahan lembut, tidak panas saat dipakai siang hari",
        "Berbahan lembut, tidak panas saat dipakai siang hari",
        "Berbahan lembut, tidak panas saat dipakai siang hari",
        "Berbahan lembut, tidak panas saat dipakai siang hari",
        "Berbahan lembut, tidak panas saat dipakai siang hari",
        "Berbahan lembut, tidak panas saat dipakai siang hari",
    )
    private val clothesImages = intArrayOf(
        R.drawable.blackjacket,
        R.drawable.dressbrown,
        R.drawable.knitcardigan,
        R.drawable.knitjacket,
        R.drawable.onesetsummer1,
        R.drawable.onesetsummer2,
        R.drawable.shirtwhite,
        R.drawable.sweaterknit,
        R.drawable.sweaternavy,
        R.drawable.vestnavy,

    )

    val listData: ArrayList<ClothesData>
    get() {
        val list = arrayListOf<ClothesData>()
        for (position in clothess.indices) {
            val clothes = ClothesData()
            clothes.clothes = clothess[position]
            clothes.price = clothesPrice[position]
            clothes.detail = clothesDetails[position]
            clothes.photo = clothesImages[position]
            list.add(clothes)
        }
        return list
    }

}