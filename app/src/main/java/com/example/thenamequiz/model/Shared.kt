package com.example.thenamequiz.model

import android.app.Application
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.example.thenamequiz.R
import java.util.*


class Shared : Application() {

   //ny
   private var PersonList: ArrayList<Person>? = null

    fun PersonList() {
        PersonList = ArrayList<Person>()
    }

    fun addPerson(name: String?, image: Bitmap?) {
        val person = Person("hassan", BitmapFactory.decodeFile(resources.toString()), R.drawable.hassan)
        PersonList!!.add(person)
    }

    fun getPersonList(): ArrayList<Person>? {
        return PersonList
    }

    fun setPersonList(PersonList: ArrayList<Person>?) {
        this.PersonList = PersonList
    }


   /* // gammel
    private var persons: ArrayList<Person>? = null

    fun SharedObject() {
        this.persons = ArrayList()
    }
    fun getPersons(): ArrayList<Person>? {
        return persons
    }
    fun addPersons(question: Person?) {
        this.persons?.add(Person())
    }*/


}