package com.example.ottproject

import android.os.Bundle
import com.example.ottproject.databinding.MainBinding
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity:AppCompatActivity() {
    private lateinit var binding: MainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navView: BottomNavigationView = binding.navView
        val navController =findNavController(R.id.nav_host_fragment_activity_main)
        navView.setupWithNavController(navController)

    }
}