package com.example.thenamequiz.activity

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.thenamequiz.R
import com.example.thenamequiz.databinding.ActivityAddBinding
import com.example.thenamequiz.databinding.ActivityMainBinding
import com.example.thenamequiz.model.Person
import com.example.thenamequiz.model.Shared

class AddActivity : AppCompatActivity() {
    private val person: Person = Person(null)
    private val shared: Shared? = null
    private val image: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}