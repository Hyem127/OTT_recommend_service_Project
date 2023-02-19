package com.example.ottproject

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Fragment_Home : Fragment() {

    lateinit var moreButton : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        moreButton = view.findViewById<Button>(R.id.ranking_more)
        moreButton?.setOnClickListener {
            val intent = Intent(activity, OTT_Ranking::class.java)
            startActivity(intent)
        }
        return view
    }
}


