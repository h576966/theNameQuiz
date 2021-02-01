package com.example.thenamequiz.model

import android.app.Application
import java.util.ArrayList

class Shared : Application() {
    private var persons: ArrayList<Person>? = null

    fun SharedObject() {
        this.persons = ArrayList()
    }
    fun getPersons(): ArrayList<Person>? {
        return persons
    }
    fun addPersons(question: Person?) {
        this.persons?.add(Person())
    }


}