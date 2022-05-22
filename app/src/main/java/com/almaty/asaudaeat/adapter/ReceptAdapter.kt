package com.almaty.asaudaeat.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.almaty.asaudaeat.KitchenActivity
import com.almaty.asaudaeat.R
import com.almaty.asaudaeat.model.Recept


class ReceptAdapter(private val list: List<Recept>, var context: Context):
    RecyclerView.Adapter<ReceptAdapter.ViewHolder>() {


    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
        val title = itemView.findViewById<TextView>(R.id.title_tort)
        val imageView = itemView.findViewById<ImageView>(R.id.imageview)
        val text = itemView.findViewById<TextView>(R.id.text_tort)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recept_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = list[position]
        holder.imageView.setImageResource(items.image)
        holder.title.setText(items.name)
        holder.text.setText(items.text)
        holder.itemView.setOnClickListener{
            val intent: Intent = Intent(context, KitchenActivity::class.java)
            intent.putExtra("name", items.name)
            intent.putExtra("image", items.image)
            intent.putExtra("text", items.text)
            intent.putExtra("position", position)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}