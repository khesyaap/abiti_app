package com.khesya.idn.clothesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.khesya.idn.clothesapp.R

class DetailClothesActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_CLOTHES = "extra_clothes"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_DETAILS = "extra_details"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_clothes)

        var actionBar = getSupportActionBar()
        actionBar?.setDisplayHomeAsUpEnabled(true)

        showClothesDetail()
    }


        private fun showClothesDetail(){
            //Variable untuk menampung ID layout
            val tvImageReceived: ImageView = findViewById(R.id.img_item_photo)
            val tvClothesReceived: TextView = findViewById(R.id.tv_item_clothes)
            val tvPriceReceived: TextView = findViewById(R.id.tv_item_price)
            val tvDetailsReceived: TextView = findViewById(R.id.tv_item_details)

            //variable untuk intent
            val photo = intent.getIntExtra(EXTRA_PHOTO,0)
            val clothes = intent.getStringExtra(EXTRA_CLOTHES)
            val price = intent.getStringExtra(EXTRA_PRICE)
            val details = intent.getStringExtra(EXTRA_DETAILS)

            tvImageReceived.setImageResource(photo)
            tvClothesReceived.setText("$clothes")
            tvPriceReceived.setText("$price")
            tvDetailsReceived.setText("$details")
        }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
