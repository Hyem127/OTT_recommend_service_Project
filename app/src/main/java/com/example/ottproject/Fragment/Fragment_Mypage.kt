package com.example.ottproject.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.ottproject.*
import com.example.ottproject.MyPage.My_Write_List
import com.example.ottproject.Start.FirstActivity


class Fragment_Mypage : Fragment() {

    lateinit var logoutButton : Button
    lateinit var communitylistButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mypage, container, false)

        logoutButton = view.findViewById<Button>(R.id.logout_button)
        logoutButton?.setOnClickListener {
            val intent = Intent(activity, FirstActivity::class.java)
            startActivity(intent)
        }

        communitylistButton = view.findViewById<Button>(R.id.community_list)
        communitylistButton?.setOnClickListener {
            val intent = Intent(activity, My_Write_List::class.java)
            startActivity(intent)
        }
        return view
    }
}







