package com.example.thenamequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thenamequiz.databinding.ActivityMainBinding
import com.example.thenamequiz.databinding.ActivityPersonDetailsBinding

class PersonDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPersonDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart(){
        super.onStart()
        val person = intent.extras?.getString("person")
        val binding = ActivityPersonDetailsBinding.inflate(layoutInflater)
        binding.personDetailsTextView.text = person


    }
}