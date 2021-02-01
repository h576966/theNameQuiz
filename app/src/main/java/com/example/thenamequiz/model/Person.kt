package com.example.thenamequiz.model

import android.graphics.Bitmap
import java.util.*


class Person {
    private var imageName: String? = null
    private var ID: String? = null
    private val image: Bitmap? = null

    fun Question(campus: Campus, image: Bitmap?) {
        imageName = imageName
        this.image = image
        ID = UUID.randomUUID().toString()
    }
