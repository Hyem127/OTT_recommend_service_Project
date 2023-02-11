package com.example.ottproject

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.ottproject.R
import com.example.ottproject.databinding.FragmentHomeBinding
import com.example.ottproject.databinding.FragmentMypageBinding


class Fragment_Mypage : Fragment() {

    lateinit var contents_evaluation: Button

    private  var _binding: FragmentMypageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding=FragmentMypageBinding.inflate(inflater, container, false)

            val root:View = binding.root
            contents_evaluation.setOnClickListener {
                Intent intent = new Intent(getAcit)
                startActivity(Intent(this@Fragment_Mypage,ContentsActivity::class.java))
            }
            return root
        }
    }


