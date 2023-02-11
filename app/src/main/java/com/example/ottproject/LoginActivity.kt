package com.example.ottproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast



class LoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        lateinit var btnLogin: Button
        btnLogin = findViewById<Button>(R.id.btnLogin)
        val login_id: EditText = findViewById(R.id.login_id)
        val login_password: EditText = findViewById(R.id.login_password)

        //메시지 담을 변수
        var idtext: String = ""
        var pwtext: String = ""

        //버튼 비활성화
        btnLogin.isEnabled = false

        //EditText 값 있을때만 버튼 활성화
        login_id.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            //값 변경 시 실행되는 함수
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                //입력값 담기
                idtext= login_id.text.toString()
                pwtext= login_password.text.toString()

                //값 유무에 따른 활성화 여부
                if(idtext.isNotEmpty() && pwtext.isNotEmpty())

                btnLogin.isEnabled = true // isNotEmpty가 true니까 isEnabled
            }

            override fun afterTextChanged(p0: Editable?) {}
        })

        //EditText 값 있을때만 버튼 활성화
        login_password.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            //값 변경 시 실행되는 함수
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                //입력값 담기
                idtext= login_id.text.toString()
                pwtext= login_password.text.toString()

                //값 유무에 따른 활성화 여부
                if(idtext.isNotEmpty() && pwtext.isNotEmpty())

                    btnLogin.isEnabled = true // isNotEmpty가 true니까 isEnabled
            }

            override fun afterTextChanged(p0: Editable?) {}
        })


        btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            var loginintent = Intent(applicationContext, MainActivity::class.java)
            startActivity(loginintent)
            Toast.makeText(getApplicationContext(), "로그인 완료!", Toast.LENGTH_LONG).show()

        }
    }
}

