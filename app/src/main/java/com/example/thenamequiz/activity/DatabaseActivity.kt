package com.example.thenamequiz.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.thenamequiz.adapter.PersonAdapter
import com.example.thenamequiz.databinding.ActivityDatabaseBinding
import com.example.thenamequiz.model.Shared


class DatabaseActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var adapter: PersonAdapter? = null
    private val Shared: Shared? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDatabaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val shared = applicationContext as Shared

        recyclerView = binding.personList
        //addButton = binding.addbutton

        binding.addbutton1.setOnClickListener {
            val intent = Intent(this, DatabaseActivity::class.java)
            startActivity(intent)
        }

        // Create recycleView-adapter and send the questions as input.
        if (Shared != null) {
            adapter = PersonAdapter(Shared.getPersons())
        }

        binding.addbutton1.setOnClickListener{
            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
        }
       recyclerView!!.setAdapter(adapter)

        val dividerItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView!!.addItemDecoration(dividerItemDecoration)
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView!!.layoutManager = linearLayoutManager

        //override onActivityResult



       /* val itemTouchHelper = ItemTouchHelper(simpleCallback)
        itemTouchHelper.attachToRecyclerView(recyclerView)

        val simpleCallback = ItemTouchHelper(
                object : ItemTouchHelper.SimpleCallback(ItemTouchHelper.UP or ItemTouchHelper.DOWN,
                        ItemTouchHelper.LEFT) {

                    override fun onMove(recyclerView: RecyclerView,
                               viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
                        return false
                    }

                    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                        Shared!!.getPersons()?.removeAt(viewHolder.adapterPosition)
                        adapter?.notifyDataSetChanged()
                    }

                })*/

    }
}

