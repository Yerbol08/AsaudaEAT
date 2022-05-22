package com.almaty.asaudaeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_main = findViewById<Button>(R.id.btn_menu)
        val btn_recept = findViewById<Button>(R.id.btn_recepts)
        val btn_admin = findViewById<Button>(R.id.admin)
        val btn_cabinet = findViewById<Button>(R.id.cabinet)
        val btn_info = findViewById<Button>(R.id.info_app)
        btn_main.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

        btn_recept.setOnClickListener {
            startActivity(Intent(this, ReceptActivity::class.java))
        }


        btn_cabinet.setOnClickListener {
            startActivity(Intent(this, UserActivity::class.java))
        }
    }
}