package com.example.ottproject.Start

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.ottproject.*
import com.example.ottproject.Home.Search_Result


class FirstActivity : AppCompatActivity() {

    lateinit var btnLogin: Button
    lateinit var btnJoin: Button
    lateinit var btnLater: Button
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first)

        btnLater = findViewById<Button>(R.id.btnLater)
        btnLater.paintFlags = btnLater.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        btnLater.text = getString(R.string.underlined_text)
        btnLater.setOnClickListener {
            var laterintent = Intent(applicationContext, MainActivity::class.java)
            startActivity(laterintent)
        }

        btnJoin = findViewById<Button>(R.id.btnJoin)
        btnJoin.setOnClickListener {
            var joinintent = Intent(applicationContext, JoinActivity::class.java)
            startActivity(joinintent)
        }

        btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            var loginintent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(loginintent)

        }

        button = findViewById<Button>(R.id.buttonn)
        button.setOnClickListener {
            var intent = Intent(applicationContext, Search_Result::class.java)
            startActivity(intent)

        }
    }
}