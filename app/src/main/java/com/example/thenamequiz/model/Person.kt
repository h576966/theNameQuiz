package com.example.thenamequiz.model

import android.graphics.Bitmap
import java.util.*


class Person {

    //Ny
    private var name: String? = null
    private var image: Bitmap? = null

    fun Person(name: String?, img: Bitmap) {
        this.name = name
        this.image = img
    }

    fun getName(): String? {
        return name
    }

    fun getImage(): Bitmap? {
        return image
    }









    //Gammel
    private var imageName: String? = null
    private var ID: String? = null
    private val image: Bitmap? = null

    fun Question(campus: Campus, image: Bitmap?) {
        imageName = imageName
        this.image = image
        ID = UUID.randomUUID().toString()
    }
