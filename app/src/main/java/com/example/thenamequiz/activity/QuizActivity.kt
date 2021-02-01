package com.example.thenamequiz.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.thenamequiz.R
import com.example.thenamequiz.model.Person
import com.example.thenamequiz.model.Shared


class QuizActivity : AppCompatActivity() {
    private val playImage: ImageView? = null
    private var shared: Shared? = null
    private val currentQuestion: Person? = null
    private val score = 0
    private val quizScore: TextView? = null
    private val currentQuiz: ArrayList<Person>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)


        // Get sharedObject.
        shared = applicationContext as Shared
    }
}