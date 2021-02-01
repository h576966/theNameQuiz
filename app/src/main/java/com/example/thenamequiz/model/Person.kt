package com.example.thenamequiz.model

import android.graphics.Bitmap


class Person(name: String, image: Bitmap) {

    private var name: String? = null
    private var image: Bitmap? = null


    fun Person(name: String?, image: Bitmap?) {
        this.name = name
        this.image = image
    }

    fun getName(): String? {
        return name
    }

    fun getImage(): Bitmap? {
        return image
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun setImage(image: Bitmap?) {
        this.image = image
    }




}