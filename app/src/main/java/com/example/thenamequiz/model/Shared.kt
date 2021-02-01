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

    fun addPersons(name: String?, image: Bitmap?) {
        val hassan = Person("hassan", BitmapFactory.decodeFile(resources.toString()), R.drawable.hassan)
        val peter = Person("peter", BitmapFactory.decodeFile(resources.toString()), R.drawable.peter)
        val sivert = Person("sivert", BitmapFactory.decodeFile(resources.toString()), R.drawable.sivert)

        PersonList!!.add(hassan)
        PersonList!!.add(peter)
        PersonList!!.add(sivert)
    }
    //fun addPerson(question: Person?) {
    //    this.persons?.add(Person())
   // }

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