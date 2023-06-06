package com.example.ottproject.Request

import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import java.util.HashMap

class CommunityRequest(write_title: String, write_content: String, chatting_link: String, listener: Response.Listener<String?>) :
    StringRequest(
        Method.POST, URL, listener, null
    ) {
    private val map: MutableMap<String, String>

    //private Map<String, String>parameters;
    init {
        map = HashMap()
        map["write_title"] = write_title
        map["write_content"] = write_content
        map["chatting_link"] = chatting_link
    }

    @Throws(AuthFailureError::class)
    override fun getParams(): Map<String, String>? {
        return map
    }

    companion object {
        //서버 URL 설정(php 파일 연동)
        private const val URL = "http://juhee3297.cafe24.com/Community.php"
    }
}