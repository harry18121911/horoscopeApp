package com.harry18121911.horscopoapp.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.harry18121911.horscopoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}