package com.example.thenamequiz.adapter

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.thenamequiz.model.Person
import java.util.*


//class PersonAdapter(persons: ArrayList<Person>?) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {
class PersonAdapter internal constructor() : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {
    lateinit var persons: ArrayList<Person>
    lateinit var context: Context



    fun PersonAdapter(persons: ArrayList<Person>): PersonAdapter? {
        this.persons = persons
    }

    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): ViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_list_item, parent, false)

       // val view: View = LayoutInflater.from(parent.context).inflate(R.layout.person_view, parent, false)
       // context = parent.context
        return ViewHolder() //view
    }

    override fun onBindViewHolder(holder: PersonAdapter.ViewHolder, position: Int) {
       // holder.campus.setText(questions!![position].getCampus().toString())
        holder.imageView.setImageBitmap(persons!![position].getImage())
    }

    override fun getItemCount(): Int {
        return persons!!.size
    }

    public class ViewHolder : RecyclerView.ViewHolder {
        ImageView imageView

        fun ViewHolder(itemView: View) {
            super(itemView)
            imageView = itemView.findViewById<View>(R.id.personQuestionImage)
        }


    }
}


/* override fun getItemCount(): Int {
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

*/