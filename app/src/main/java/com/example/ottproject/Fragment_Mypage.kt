package com.example.ottproject

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment



class Fragment_Mypage : Fragment() {

    lateinit var contentsButton : Button
    lateinit var logoutButton : Button
    lateinit var contentslistButton: Button
    lateinit var communitylistButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mypage, container, false)

        contentsButton = view.findViewById<Button>(R.id.contents_evaluation)
        contentsButton?.setOnClickListener {
            val intent = Intent(activity, ContentsActivity::class.java)
            startActivity(intent)
        }

        logoutButton = view.findViewById<Button>(R.id.logout_button)
        logoutButton?.setOnClickListener {
            val intent = Intent(activity, FirstActivity::class.java)
            startActivity(intent)
        }

        contentslistButton = view.findViewById<Button>(R.id.contents_list)
        contentslistButton?.setOnClickListener {
            val intent = Intent(activity, My_Contents_List::class.java)
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







