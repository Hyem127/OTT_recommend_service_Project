package com.example.ottproject

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment



class Fragment_Community : Fragment() {

    lateinit var community_write : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_community, container, false)
        community_write = view.findViewById<Button>(R.id.community_write)

        community_write?.setOnClickListener {
            val intent = Intent(activity, Community_Write::class.java)
            startActivity(intent)
        }
        return view
    }
}







