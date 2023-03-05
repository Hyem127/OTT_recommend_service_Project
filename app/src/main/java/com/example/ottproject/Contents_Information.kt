package com.example.ottproject

import android.R
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class Contents_Information : AppCompatActivity() {

//    lateinit var netflix_Button: Button
//    netflix_Button = findViewById<Button>(R.id.netflix)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.ottproject.R.layout.contents_information)

//        netflix_Button.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"))
//            startActivity(intent)
//        }

    }
}
