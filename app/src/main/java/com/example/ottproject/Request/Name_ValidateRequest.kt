package com.example.ottproject

import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest


class Name_ValidateRequest (name: String, listener: Response.Listener<String?>) :
    StringRequest(Method.POST, URL, listener, null) {

    private val map: MutableMap<String, String>

    init {
        map = HashMap()
        map["name"] = name
    }

    @Throws(AuthFailureError::class)
    override fun getParams(): Map<String, String>? {
        return map
    }

    companion object {
        //서버 URL 설정
        private const val URL = "http://juhee3297.cafe24.com/namecheck.php"
    }

}