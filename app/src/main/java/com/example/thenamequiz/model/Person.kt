package com.example.thenamequiz.model

import android.graphics.Bitmap


class Person(s: String, decodeResource: Bitmap, hassan: Int) {

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




}