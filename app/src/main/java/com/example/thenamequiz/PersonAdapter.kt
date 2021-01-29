package com.example.thenamequiz

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.thenamequiz.databinding.ActivityMainBinding
import com.example.thenamequiz.databinding.PersonViewBinding

class PersonAdapter(val pics: ArrayList<ImageView>) : RecyclerView.Adapter<PersonAdapter.TextHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
       return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.person_view), parent, false))
    }

    override fun onBindViewHolder(holder: PersonAdapter.TextHolder, position: Int) {
       val person = persons[position]
        holder.bindPerson(person)
    }

    override fun getItemCount(): Int {
        return persons.count()
    }
    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        var view : View = v
        var person : String=""
        init {
            v.setOnClickListener(this)
        }

        fun bindPerson(person : String) {
            this.person = person
            view.itemTextView.text = person

        }

        override fun onClick(v: View?) {
            val detailIntent = Intent(view.context, PersonDetailsActivity::class.java)
            detailIntent.putExtra("person", person)
            startActivity(view.context,detailIntent, null)
        }

    }

}