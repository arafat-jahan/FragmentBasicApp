package com.example.fragmentbasic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragmentbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the binding layout properly
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Button click listeners
        binding.button1.setOnClickListener {
            gotoFragment(FirstFragment()) // Load the first fragment
        }

        binding.button2.setOnClickListener {
            gotoFragment(SecondFragment()) // Load the second fragment
        }
    }

    // Fragment navigation logic
    private fun gotoFragment(fragment: Fragment) {
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }
}
