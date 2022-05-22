package com.almaty.asaudaeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        val btn_main = findViewById<Button>(R.id.btn_menu)
        val btn_recept = findViewById<Button>(R.id.recepts)
        btn_main.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
        btn_recept.setOnClickListener {
            startActivity(Intent(this, ReceptActivity::class.java))
        }
    }
}