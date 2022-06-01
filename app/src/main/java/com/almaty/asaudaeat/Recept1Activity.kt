package com.almaty.asaudaeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recept1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recept1)
        val btn1 = findViewById<Button>(R.id.food1)
        val btn2 = findViewById<Button>(R.id.food2)
        val btn3 = findViewById<Button>(R.id.tort)
        val intent = Intent(this, ReceptActivity::class.java)
        btn1.setOnClickListener {
            intent.putExtra("type", 1)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            intent.putExtra("type", 2)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            intent.putExtra("type", 3)
            startActivity(intent)
        }
    }
}