package com.example.ottproject.Start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.ottproject.R

import com.android.volley.Response
import com.android.volley.toolbox.Volley
import com.example.ottproject.Fragment.Fragment_Home
import com.example.ottproject.LoginRequest
import org.json.JSONException
import org.json.JSONObject

class LoginActivity : AppCompatActivity() {

    private var login_id: EditText? = null
    private var login_pw: EditText? = null
    private var btn_login: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        login_id = findViewById(R.id.login_id)
        login_pw = findViewById(R.id.login_password)
        btn_login = findViewById(R.id.btnLogin)


        btn_login?.setOnClickListener(View.OnClickListener {

            val id = login_id?.getText().toString()
            val pass = login_pw?.getText().toString()
            val responseListener = Response.Listener<String?> { response ->
                try {
                    val jsonObject = JSONObject(response)
                    val success = jsonObject.getBoolean("success")

                    if (success) { //로그인 성공
                        Toast.makeText(applicationContext, "로그인에 성공하였습니다.", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent(this@LoginActivity, Fragment_Home::class.java)
                        intent.putExtra("id", id)
                        intent.putExtra("pass", pass)
                        startActivity(intent)
                    } else { //로그인 실패
                        Toast.makeText(applicationContext, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT)
                            .show()
                        return@Listener
                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }
            val loginRequest = LoginRequest(id, pass, responseListener)
            val queue = Volley.newRequestQueue(this@LoginActivity)
            queue.add(loginRequest)
        })
    }
    }
