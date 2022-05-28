package com.almaty.asaudaeat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.almaty.asaudaeat.adapter.MainAdapter
import com.almaty.asaudaeat.adapter.ReceptAdapter
import com.almaty.asaudaeat.model.MainItems
import com.almaty.asaudaeat.model.Recept

class ReceptActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recept)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        val data = arrayListOf<Recept>()
        data.add(Recept(R.string.tort1, R.drawable.tort1, R.string.text_tort1))
        data.add(Recept(R.string.tort2, R.drawable.tort2, R.string.text_tort2))
        data.add(Recept(R.string.tort3, R.drawable.tort3, R.string.text_tort3))
        data.add(Recept(R.string.tort4, R.drawable.tort4, R.string.text_tort4))
        data.add(Recept(R.string.tort5, R.drawable.tort5, R.string.text_tort5))

        data.add(Recept(R.string.sup1, R.drawable.sup1, R.string.sup_text1))
        data.add(Recept(R.string.sup2, R.drawable.sup2, R.string.sup_text2))
        data.add(Recept(R.string.sup3, R.drawable.sup3, R.string.sup_text3))
        data.add(Recept(R.string.sup4, R.drawable.sup4, R.string.sup_text4))

        data.add(Recept(R.string.second1, R.drawable.second1, R.string.second_text1))
        data.add(Recept(R.string.second2, R.drawable.second2, R.string.second_text2))
        data.add(Recept(R.string.second3, R.drawable.second3, R.string.second_text3))
        val adapter = ReceptAdapter(list = data,context = applicationContext)
        recyclerView.adapter = adapter
    }
}