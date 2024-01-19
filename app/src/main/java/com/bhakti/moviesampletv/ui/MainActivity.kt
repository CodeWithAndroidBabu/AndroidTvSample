package com.bhakti.moviesampletv.ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.bhakti.moviesampletv.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}