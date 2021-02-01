package com.example.thenamequiz.activity

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.thenamequiz.databinding.ActivityQuizBinding
import com.example.thenamequiz.model.Person
import com.example.thenamequiz.model.PersonList
import java.net.PasswordAuthentication
import java.util.*
import kotlin.collections.ArrayList


class QuizActivity : AppCompatActivity() {
    private var quizImage: ImageView? = null
    private var personList: PersonList? = null
    private var currentPerson: Person? = null
    private var score = 0
    private var quizScore: TextView? = null
    private var currentQuiz: ArrayList<Person>? = null
    lateinit var namePassword: PasswordAuthentication

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get sharedObject.
        personList = applicationContext as PersonList


        // Get image- and playScore-View.
        quizImage = binding.quizImage
        quizScore = binding.quizScore


        // Get back-button and configure onclick to end current activity.

        startQuiz();

    }

    private fun startQuiz() {
        // Get random question and set bitmap
        currentPerson = getRandomPerson()
        quizScore?.setBackgroundColor(Color.WHITE)
        score = 0
        quizScore?.setText("Score: $score")
        if (currentPerson != null) {
            quizImage?.setImageBitmap(currentPerson!!.getImage())
        }
    }

    private fun getRandomPerson(): Person? {
        if (currentQuiz == null) {
            currentQuiz = ArrayList(PersonList.getPersonList())
        }
        var person: Person? = null
        if (currentQuiz!!.size > 1) {
            val random = Random()
            val nextPerson: Int = random.nextInt(currentQuiz!!.size - 1)
            person = currentQuiz!![nextPerson]
            currentQuiz!!.removeAt(nextPerson)
        } else if (currentQuiz!!.size == 1) {
            person = currentQuiz!![0]
            currentQuiz!!.removeAt(0)
        } else {
            currentQuiz = null
            showAlertQuizIsDone()
        }
        return person
    }

    fun showAlertQuizIsDone() {
        AlertDialog.Builder(this)
                .setMessage("Your score is: " + score )
                .setIcon(android.R.drawable.ic_dialog_alert)
                /*.setNeutralButton("Reset", (dialog, which) -> startQuiz())
        .setNegativeButton("OK", (dialog, which) -> finish())
        .show();*/

    }
}