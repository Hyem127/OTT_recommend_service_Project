package com.example.ottproject.Start

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.android.volley.Response
import com.android.volley.toolbox.Volley
import com.example.ottproject.ID_ValidateRequest
import com.example.ottproject.JoinRequest
import com.example.ottproject.Name_ValidateRequest
import com.example.ottproject.R
import org.json.JSONException
import org.json.JSONObject

class JoinActivity : AppCompatActivity() {
    private val IP_ADDRESS = "123.248.24.126"
    private var join_id: EditText? = null
    private var join_pw: EditText? = null
    private var join_name: EditText? = null
    private var join_repw: EditText? = null
    private var join_button: Button? = null
    private var join_idcheck: Button? = null
    private var join_namecheck: Button? = null
    private var dialog: AlertDialog? = null
    private var validate = false
    private var namevalidate = false
    private val passvalidate =
        "[_A-Za-z0-9-]+(\\/[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.join)


        join_id = findViewById(R.id.join_id) //아이디 입력
        join_pw = findViewById(R.id.join_password) //비번 입력
        join_repw = findViewById(R.id.join_repw) //비번 재입력
        join_name = findViewById(R.id.join_name) //별명 입력

        //아이디 중복체크 버튼 클릭 시 수행
        join_idcheck = findViewById(R.id.join_idcheck) //아이디 체크 버튼
        join_idcheck?.setOnClickListener(View.OnClickListener {

            //입력되어 있는 값을 get 해온다
            val id = join_id?.getText().toString()
            if (validate) {
                Log.e("DDong","DDOng")
                return@OnClickListener
            }
            if (id == "") {
                val builder = AlertDialog.Builder(this@JoinActivity)
                builder.setMessage("아이디를 적어주세요.")
                    .setPositiveButton("확인", null)
                    .create()
                builder.show()
                return@OnClickListener
            }
//            else if (id != ("/^[a-z]/i")) {
//                val builder = AlertDialog.Builder(this@RegisterActivity)
//                builder.setMessage("빈 칸 없이 입력해주세요.")
//                    .setPositiveButton("확인", null)
//                    .create()
//                builder.show()
//                return@OnClickListener
//        }

            val responseListener = Response.Listener<String?> { response ->
                Toast.makeText(applicationContext, "사용가능한 아이디입니ekdekd.", Toast.LENGTH_SHORT)
                    .show()
                try {
                    val jsonObject = JSONObject(response)
                    val success = jsonObject.getBoolean("success")

                    if (success) { //성공
                        Toast.makeText(applicationContext, "사용가능한 아이디입니다.", Toast.LENGTH_SHORT)
                            .show()
                        Log.e("login good", "hhh")

                        validate = true
                        join_idcheck?.setBackgroundColor(getResources().getColor(R.color.purple_200))
                    } else {
                        Toast.makeText(applicationContext, "사용할 수 없는 아이디입니다.", Toast.LENGTH_SHORT)
                            .show()
                        Log.e("hihi", "yyy")
                        return@Listener
                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
                    Log.e("fail", "dddd")
                }
            }
            val validateRequest = ID_ValidateRequest(id, responseListener)
            val queue = Volley.newRequestQueue(this@JoinActivity)
            queue.add(validateRequest)

        })

//        et_pass?.addTextChangedListener(object : TextWatcher {
//
//            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
//            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
//
//            override fun afterTextChanged(p0: Editable?) {
//
//
////                if(Pattern.matches("^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-zA-Z]).{8,20}$", et_pass) {
////                    et_pass?.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.purple_700))
////                } else {
////                    et_pass?.setTextColor(ContextCompat.getColor(applicationContext!!, R.color.colorWarning))
////                }
////            }
////        })


        //비밀번호 일치 여부 확인하기

        join_repw?.addTextChangedListener(object : TextWatcher {
            // EditText에 문자 입력 전
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            // EditText에 변화가 있을 경우
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            // EditText 입력이 끝난 후
            override fun afterTextChanged(p0: Editable?) {
                if (join_pw?.getText().toString().equals(join_repw?.getText().toString())) {
                    join_repw?.setTextColor(
                        ContextCompat.getColor(
                            applicationContext!!,
                            R.color.purple_700
                        )
                    )
                } else {
                    join_repw?.setTextColor(
                        ContextCompat.getColor(
                            applicationContext!!,
                            R.color.purple_200
                        )
                    )
                }
            }
        })

        //별명 중복체크 버튼 클릭 시 수행
        join_namecheck = findViewById(R.id.join_namecheck) //별명 중복체크 버튼
        join_namecheck?.setOnClickListener(View.OnClickListener {

            //입력되어 있는 값을 get 해온다
            val name = join_name?.getText().toString()
            if (namevalidate) {
                return@OnClickListener
            }
            if (name == "") {
                val builder = AlertDialog.Builder(this@JoinActivity)
                builder.setMessage("별명을 적어주세요.")
                    .setPositiveButton("확인", null)
                    .create()
                builder.show()
                return@OnClickListener
            }

            val responseListener = Response.Listener<String?> { response ->

                try {
                    val jsonObject = JSONObject(response)
                    val success = jsonObject.getBoolean("success")

                    if (success) { //성공
                        Toast.makeText(
                            applicationContext,
                            "사용가능한 별명입니다.",
                            Toast.LENGTH_SHORT
                        )
                            .show()

                        namevalidate = true
                        join_namecheck?.setBackgroundColor(getResources().getColor(R.color.purple_200))
                    } else {
                        Toast.makeText(
                            applicationContext,
                            "사용할 수 없는 별명입니다.",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                        return@Listener
                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }
            val namevalidateRequest = Name_ValidateRequest(name, responseListener)
            val queue = Volley.newRequestQueue(this@JoinActivity)
            queue.add(namevalidateRequest)

        })

        //회원가입 버튼 클릭 시 수행
        join_button = findViewById(R.id.join_button)
        join_button?.setOnClickListener(View.OnClickListener {

            //입력되어 있는 값을 get 해온다
            val id = join_id?.getText().toString()
            val password = join_pw?.getText().toString()
            val name = join_name?.getText().toString()


            if (id == "" || password == "" || name == "") {
                val builder = AlertDialog.Builder(this@JoinActivity)
                builder.setMessage("빈 칸 없이 입력해주세요.")
                    .setPositiveButton("확인", null)
                    .create()
                builder.show()
                return@OnClickListener
            } else if (!validate) {
                val builder = AlertDialog.Builder(this@JoinActivity)
                builder.setMessage("아이디 중복체크를 해주세요.")
                    .setPositiveButton("확인", null)
                    .create()
                builder.show()
                return@OnClickListener
            } else if (!namevalidate) {
                val builder = AlertDialog.Builder(this@JoinActivity)
                builder.setMessage("별명 중복체크를 해주세요.")
                    .setPositiveButton("확인", null)
                    .create()
                builder.show()
                return@OnClickListener
            } else if (join_pw !== join_repw) {
                val builder = AlertDialog.Builder(this@JoinActivity)
                builder.setMessage("비밀번호가 다릅니다.")
                    .setPositiveButton("확인", null)
                    .create()
                builder.show()
                return@OnClickListener
            }

            val responseListener = Response.Listener<String?> { response ->

                try {
                    val jsonObject = JSONObject(response)
                    val success = jsonObject.getBoolean("success")

                    if (success) { //성공
                        Toast.makeText(
                            applicationContext,
                            "회원등록에 성공하였습니다.",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                        val intent =
                            Intent(this@JoinActivity, LoginActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(
                            applicationContext,
                            "회원등록에 실패하였습니다.",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                        return@Listener
                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }

            // 서버로 Volley를 이용해서 요청을 함.
            val registerRequest = JoinRequest(id, password, name, responseListener)
            val queue = Volley.newRequestQueue(this@JoinActivity)
            queue.add(registerRequest)

        })
    }
}

