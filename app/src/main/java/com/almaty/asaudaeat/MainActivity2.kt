package com.almaty.asaudaeat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.almaty.asaudaeat.adapter.MainAdapter
import com.almaty.asaudaeat.model.MainItems

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        val data = arrayListOf<MainItems>()
        data.add(MainItems("17.05.2022", "Завтрак", "Манная каша", "450 гр."))
        data.add(MainItems("17.05.2022", "Завтрак", "Бутерброд: сыр, масло сливочное", "75 гр."))
        data.add(MainItems("17.05.2022", "Завтрак", "Чай", "450 гр."))
        data.add(MainItems("17.05.2022", "Завтрак", "Манная каша", "450 гр."))
        data.add(MainItems("17.05.2022", "Завтрак", "Манная каша", "450 гр."))
        data.add(MainItems("17.05.2022", "Завтрак", "Манная каша", "450 гр."))
        data.add(MainItems("17.05.2022", "Завтрак", "Манная каша", "450 гр."))
        data.add(MainItems("17.05.2022", "Завтрак", "Манная каша", "450 гр."))
        data.add(MainItems("17.05.2022", "Завтрак", "Манная каша", "450 гр."))
        val adapter = MainAdapter(list = data,context = applicationContext)
        recyclerView.adapter = adapter
    }
}