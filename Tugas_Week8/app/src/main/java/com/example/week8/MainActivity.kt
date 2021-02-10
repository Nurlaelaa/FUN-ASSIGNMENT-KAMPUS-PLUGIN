package com.example.week8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week8.adaptor.TodoAdaptor
import com.example.week8.databinding.ActivityMainBinding
import com.example.week8.model.Todo

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var todoList = mutableListOf(
            Todo("item1", false),
            Todo("item2", false),
            Todo("item3", false),
            Todo("item4", false)
        )


        val adaptor = TodoAdaptor(todoList)
        binding.rcView.adapter = adaptor
        binding.rcView.layoutManager = LinearLayoutManager(this)

        binding.button.setOnClickListener {
            val title = binding.edittext.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adaptor.notifyDataSetChanged()
            adaptor.notifyItemRangeInserted(todoList.size)
        }
    }
}