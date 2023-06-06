package com.example.ottproject.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.ottproject.Home.Contents_Information
import com.example.ottproject.Home.OTT_Ranking
import com.example.ottproject.R
import com.example.ottproject.Home.Recommend_All

class Fragment_Home : Fragment() {

    lateinit var moreButton : ImageButton
    lateinit var recommend_moreButton : ImageButton

    lateinit var ar_one : ImageButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        moreButton = view.findViewById<ImageButton>(R.id.ranking_more)
        moreButton?.setOnClickListener {
            val intent = Intent(activity, OTT_Ranking::class.java)
            startActivity(intent)
        }

        recommend_moreButton = view.findViewById<ImageButton>(R.id.recommend_morebutton)
        recommend_moreButton?.setOnClickListener {
            val intent = Intent(activity, Recommend_All::class.java)
            startActivity(intent)
        }

        ar_one = view.findViewById<ImageButton>(R.id.app_ranking_one)
        ar_one?.setOnClickListener {
            val intent = Intent(activity, Contents_Information::class.java)
            startActivity(intent)
        }
        return view
    }

}


