package com.example.ottproject

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class FirstActivity : AppCompatActivity() {

    lateinit var btnLogin: Button
    lateinit var btnJoin: Button
    lateinit var btnLater: Button
    lateinit var btncontents: Button

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

        btncontents = findViewById<Button>(R.id.btncontents)
        btncontents.setOnClickListener {
            var contentsintent = Intent(applicationContext, Contents_Information::class.java)
            startActivity(contentsintent)

        }

    }
}