package com.example.ottproject

import android.R
import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.json.JSONException
import org.json.JSONObject


class JoinActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.join)

        lateinit var btn_join: Button
        btn_join = findViewById<Button>(com.example.ottproject.R.id.join_button)

        btn_join.setOnClickListener {
            var joinintent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(joinintent)
            Toast.makeText(getApplicationContext(), "회원가입 완료! 이제 로그인해 보세요.", Toast.LENGTH_LONG).show()
        } //이거 되나 함 실험해본다
    }
}




