package com.example.thenamequiz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thenamequiz.databinding.PersonViewBinding


class PersonAdapter(private var itemsCells: ArrayList<String?>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        override fun getItemCount(): Int {
            return itemsCells.size
        }

        class ItemViewHolder(var viewBinding: PersonViewBinding) : RecyclerView.ViewHolder(viewBinding.root)


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val binding = PersonViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ItemViewHolder(binding)
        }



        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val itemViewHolder = holder as ItemViewHolder
            itemViewHolder.viewBinding.nameTextView.text = "peter" //itemsCells[position]
        }
    }

