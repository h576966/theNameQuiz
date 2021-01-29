package com.example.thenamequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.thenamequiz.databinding.ActivityDatabaseBinding
import com.example.thenamequiz.databinding.ActivityMainBinding

class DatabaseActivity : AppCompatActivity() {
    lateinit var layoutManager : LinearLayoutManager
    lateinit var adapter: PicAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDatabaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val photoList = binding.photoList<RecyclerView>

        layoutManager = GridLayoutManager(this,2)
        binding.photoList.layoutManager = layoutManager


        adapter = PicAdapter(arrayListOf("@drawable/PeterSimonsen"))
        binding.photoList.adapter = adapter

    }
}