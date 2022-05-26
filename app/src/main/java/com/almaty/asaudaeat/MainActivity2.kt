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
        data.add(MainItems("17.05.2022", "Завтрак", "Чай", "200 гр."))
        data.add(MainItems("17.05.2022", "Обед", "Суп куринный", "450 гр."))
        data.add(MainItems("17.05.2022", "Обед", "Котлета", "350 гр."))
        data.add(MainItems("17.05.2022", "Обед", "Салат", "150 гр."))
        data.add(MainItems("17.05.2022", "Ужин", "Суп горох", "450 гр."))
        data.add(MainItems("17.05.2022", "Ужин", "Пицца", "200 гр."))
        data.add(MainItems("17.05.2022", "Ужин", "Чай", "200 гр."))
        val adapter = MainAdapter(list = data,context = applicationContext)
        recyclerView.adapter = adapter
    }
}