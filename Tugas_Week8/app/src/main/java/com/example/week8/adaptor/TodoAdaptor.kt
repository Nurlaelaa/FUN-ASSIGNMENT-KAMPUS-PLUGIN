package com.example.week8.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.week8.databinding.TodoItemBinding
import com.example.week8.model.Todo

class TodoAdaptor(var todo: List<Todo>): RecyclerView.Adapter<TodoAdaptor.TodoViewHolder> (){

    inner class TodoViewHolder(val binding: TodoItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder((TodoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)))

    }

    override fun getItemCount(): Int {
        return todo.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
      holder.binding.apply {
      tv1.text = todo[position].title
          cb1.isChecked=todo[position].isChecked
      }
    }

    fun notifyItemRangeInserted(size: Int) {
        TODO("Not yet implemented")
    }


}