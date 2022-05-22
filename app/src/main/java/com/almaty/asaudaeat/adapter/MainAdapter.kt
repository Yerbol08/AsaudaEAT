package com.almaty.asaudaeat.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.almaty.asaudaeat.R
import com.almaty.asaudaeat.model.MainItems

class MainAdapter(private val list: List<MainItems>, var context: Context):
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
        val date = itemView.findViewById<TextView>(R.id.date)
        val name = itemView.findViewById<TextView>(R.id.name1)
        val name2 = itemView.findViewById<TextView>(R.id.name2)
        val gram = itemView.findViewById<TextView>(R.id.gram)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        val items = list[position]
        holder.date.setText(items.date)
        holder.name.setText(items.name)
        holder.name2.setText(items.name2)
        holder.gram.setText(items.gram)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}