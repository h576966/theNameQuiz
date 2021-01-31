package com.example.thenamequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thenamequiz.databinding.ActivityDatabaseBinding

class DatabaseActivity : AppCompatActivity() {
    lateinit var layoutManager : LinearLayoutManager
    lateinit var adapter: PersonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDatabaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val photoList = binding.photoList<RecyclerView>

        binding.photoList.apply {
            layoutManager = GridLayoutManager(this@DatabaseActivity, 2)
            adapter = PersonAdapter(arrayListOf(""))

        }

        binding.photoList.layoutManager = layoutManager


        binding.photoList.adapter = adapter

    }
}