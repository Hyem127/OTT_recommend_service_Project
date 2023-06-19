package com.example.ottproject

import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import java.lang.reflect.Method
import java.util.HashMap

class LoginRequest(id: String, password: String, listener: Response.Listener<String?>) :
    StringRequest(
        Method.POST, URL, listener, null
    ) {
    private val map: MutableMap<String, String>

    //private Map<String, String>parameters;
    init {
        map = HashMap()
        map["id"] = id
        map["password"] = password
    }

    @Throws(AuthFailureError::class)
    override fun getParams(): Map<String, String>? {
        return map
    }

    companion object {
        //서버 URL 설정(php 파일 연동)
        private const val URL = "http://juhee3297.cafe24.com/Login.php"
    }
}
