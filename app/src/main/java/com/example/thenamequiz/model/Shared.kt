package com.example.thenamequiz.model

import android.app.Application
import java.util.ArrayList

class Shared : Application {
    private val persons: ArrayList<Person>? = null

    fun SharedObject() {
        this.persons = ArrayList()
    }
    fun getQuestions(): ArrayList<Person?>? {
        return persons
    }
    fun addQuestion(question: Person?) {
        this.persons.add(Person())
    }


}