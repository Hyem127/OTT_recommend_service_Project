package com.example.ottproject

import com.android.volley.toolbox.StringRequest
import com.android.volley.AuthFailureError
import com.android.volley.Response
import java.lang.reflect.Method
import java.util.HashMap

class JoinRequest(id: String, password: String, name: String, listener: Response.Listener<String?>) :
    StringRequest(
        Method.POST, URL, listener, null
    ) {
    private val map: MutableMap<String, String>

    //private Map<String, String>parameters;
    init {
        map = HashMap()
        map["id"] = id
        map["password"] = password
        map["name"] = name
    }

    @Throws(AuthFailureError::class)
    override fun getParams(): Map<String, String>? {
        return map
    }

    companion object {
        //서버 URL 설정(php 파일 연동)
        private const val URL = "http://123.248.24.126/Register.php"
    }
}