package com.khesya.idn.clothesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.khesya.idn.clothesapp.R

class ProfileActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvImageReceived:ImageView = findViewById(R.id.photouser)
        val tvNameReceived:TextView = findViewById(R.id.NameProfile)
        val tvEmailReceived:TextView = findViewById(R.id.Email)

        val picture = intent.getIntExtra(EXTRA_PHOTO,0)
        val user = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)

        tvImageReceived.setImageResource(picture)
        tvNameReceived.text = user
        tvEmailReceived.text = email



    }
}