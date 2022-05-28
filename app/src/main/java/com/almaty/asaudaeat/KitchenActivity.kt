package com.almaty.asaudaeat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class KitchenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kitchen)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val title_kitchen =  findViewById<TextView>(R.id.title_kitchen)
        val text_kitchen =  findViewById<TextView>(R.id.textView_kitchen)

        val position = getIntent().getIntExtra("position", 0)
        val title = getIntent().getIntExtra("name", R.string.tort1)
        val image = getIntent().getIntExtra("image", R.drawable.tort1)
        val text  = getIntent().getIntExtra("text", R.string.text_tort1)
        title_kitchen.setText(title)
        imageView.setImageResource(image)
        text_kitchen.setText(text)

        when(position){
            0-> {
                imageView2.setImageResource(R.drawable.image_1)
            }
            1-> imageView2.setImageResource(R.drawable.image_2)
            2-> imageView2.setImageResource(R.drawable.image_3)
            3-> imageView2.setImageResource(R.drawable.image_4)
            4-> imageView2.setImageResource(R.drawable.image_5)
            5-> imageView2.setImageResource(R.drawable.image6)
            6-> imageView2.setImageResource(R.drawable.image7)
            7-> imageView2.setImageResource(R.drawable.image8)
            8-> imageView2.setImageResource(R.drawable.image9)
            9-> imageView2.setImageResource(R.drawable.image10)
            10-> imageView2.setImageResource(R.drawable.image11)
            11-> imageView2.setImageResource(R.drawable.image12)

        }
    }
}
