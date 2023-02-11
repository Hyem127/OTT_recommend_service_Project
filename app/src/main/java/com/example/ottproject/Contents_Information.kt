package com.example.ottproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Contents_Information : AppCompatActivity() {

    lateinit var netflix: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contents_information)

//        netflix.setOnClickListener {
//            var netflixintent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.netflix.com"))
//            startActivity(netflixintent)
//        }
            }
    }