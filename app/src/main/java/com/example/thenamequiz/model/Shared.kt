package com.example.thenamequiz.model

import android.graphics.Bitmap
import com.example.thenamequiz.R
import java.util.*


class Shared  {

   //ny
   private var personList: ArrayList<Person>? = null

    fun Shared() {
        personList = ArrayList<Person>()
    }

    fun addPerson(name:String, image:Bitmap) {
        val person = Person(name, image)
        personList?.add(person)
    }
    //fun addPerson(question: Person?) {
    //    this.persons?.add(Person())
   // }

    fun getPersonList(): ArrayList<Person>? {
        return personList
    }

    fun setPersonList(PersonList: ArrayList<Person>?) {
        this.personList = PersonList
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