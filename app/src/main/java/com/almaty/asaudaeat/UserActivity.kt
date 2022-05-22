package com.almaty.asaudaeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.almaty.asaudaeat.Login.Choice
import com.google.firebase.auth.FirebaseAuth

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        val nameTv = findViewById<TextView>(R.id.nameTv)
        val emailTv = findViewById<TextView>(R.id.emailTv)
        val logout = findViewById<Button>(R.id.buttonLogout)

        val name = FirebaseAuth.getInstance().currentUser?.displayName
        val email = FirebaseAuth.getInstance().currentUser?.email
        nameTv.text = name
        emailTv.text = email

        logout.setOnClickListener {
            FirebaseAuth.getInstance().signOut();
            startActivity(Intent(this, Choice::class.java))
        }
    }
}