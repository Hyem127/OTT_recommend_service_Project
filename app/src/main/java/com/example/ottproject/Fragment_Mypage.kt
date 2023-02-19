package com.example.ottproject

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.ottproject.databinding.JoinBinding.inflate


class Fragment_Mypage : Fragment() {
    lateinit var contentsButton : Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mypage, container, false)
        contentsButton = view.findViewById<Button>(R.id.contents_evaluation)

        contentsButton?.setOnClickListener {
            System.out.println("?")
            val intent = Intent(activity, ContentsActivity::class.java)
            startActivity(intent)
        }
        return view
    }
}







