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
        } //얏호 깃허브 연동 성공?
    }
}

//        lateinit var idcheck : Button
//        idcheck = findViewById<Button>(R.id.idcheck_button)
//        lateinit var namecheck:Button
//        namecheck = findViewById<Button>(R.id.nicknamecheck_button)
//        lateinit var joinbutton : Button
//        joinbutton = findViewById<Button>(R.id.join_button)
//        val join_id: EditText = findViewById(R.id.join_id)
//        val join_password: EditText = findViewById(R.id.login_password)
//        val join_repw: EditText = findViewById(R.id.join_repw)
//        val join_name: EditText = findViewById(R.id.join_name)
//
//        //메시지 담을 변수
//        var idtext: String = ""
//        var pwtext: String = ""
//        var repwtext: String = ""
//        var nametext: String = ""
//
//        //버튼 비활성화
//        joinbutton.isEnabled = false
//
//        //아이디 중복 체크
//        idcheck.setOnClickListener(object : View.OnClickListener() {
//            fun onClick(view: View?) {
//                val : String = join_id.getText().toString()
//                if (validate) {
//                    return  //검증 완료
//                }
//                if (UserEmail == "") {
//                    val builder = AlertDialog.Builder(this@RegisterActivity)
//                    dialog =
//                        builder.setMessage("아이디를 입력하세요.").setPositiveButton("확인", null).create()
//                    dialog.show()
//                    return
//                }
//                val responseListener: Response.Listener<String> = object : Listener<String?>() {
//                    fun onResponse(response: String?) {
//                        try {
//                            val jsonResponse = JSONObject(response)
//                            val success = jsonResponse.getBoolean("success")
//                            if (success) {
//                                val builder = AlertDialog.Builder(this@RegisterActivity)
//                                dialog = builder.setMessage("사용할 수 있는 아이디입니다.")
//                                    .setPositiveButton("확인", null).create()
//                                dialog.show()
//                                join_email.setEnabled(false) //아이디값 고정
//                                validate = true //검증 완료
//                                check_button.setBackgroundColor(resources.getColor(R.color.colorGray))
//                            } else {
//                                val builder = AlertDialog.Builder(this@RegisterActivity)
//                                dialog = builder.setMessage("이미 존재하는 아이디입니다.")
//                                    .setNegativeButton("확인", null).create()
//                                dialog.show()
//                            }
//                        } catch (e: JSONException) {
//                            e.printStackTrace()
//                        }
//                    }
//                }
//                val validateRequest = ValidateRequest(UserEmail, responseListener)
//                val queue: RequestQueue = Volley.newRequestQueue(this@RegisterActivity)
//                queue.add(validateRequest)
//            }
//        })
//
//
//
//





