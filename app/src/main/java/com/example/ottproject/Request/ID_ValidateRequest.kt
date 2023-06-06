package com.example.ottproject

import com.android.volley.toolbox.StringRequest
import com.android.volley.AuthFailureError
import com.android.volley.Response
import java.util.HashMap

class ID_ValidateRequest (id: String, listener: Response.Listener<String?>) :
    StringRequest(Method.POST, URL, listener, null) {

    private val map: MutableMap<String, String>

    init {
        map = HashMap()
        map["id"] = id
    }

    @Throws(AuthFailureError::class)
    override fun getParams(): Map<String, String>? {
        return map
    }

    companion object {
        //서버 URL 설정(php 파일 연동)
        private const val URL = "http://123.248.24.126/usercheck.php"
    }
}