package com.example.thenamequiz

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PicAdapter(val pics: ArrayList<String>) : RecyclerView.Adapter<PicAdapter.TextHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
       return TextHolder(LayoutInflater.from(parent.context).inflate(....), parent, false))
    }

}