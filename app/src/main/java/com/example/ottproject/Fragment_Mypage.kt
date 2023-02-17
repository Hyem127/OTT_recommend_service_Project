package com.example.ottproject

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class Fragment_Mypage : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mypage, container, false)

        val contentsButton = view?.findViewById<Button>(R.id.contents_evaluation)

        contentsButton?.setOnClickListener(object :View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(context, ContentsActivity::class.java)
                startActivity(intent)
                // 다른 액티비티에서 전환할 때
                // activity?.finish()
            }
        })
        return view
    }
    }








