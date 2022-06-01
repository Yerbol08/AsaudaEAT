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

        when(title){
            R.string.tort1-> {
                imageView2.setImageResource(R.drawable.image_1)
            }
            R.string.tort2-> imageView2.setImageResource(R.drawable.image_2)
            R.string.tort3-> imageView2.setImageResource(R.drawable.image_3)
            R.string.tort4-> imageView2.setImageResource(R.drawable.image_4)
            R.string.tort5-> imageView2.setImageResource(R.drawable.image_5)
            R.string.sup1-> imageView2.setImageResource(R.drawable.image6)
            R.string.sup2-> imageView2.setImageResource(R.drawable.image7)
            R.string.sup3-> imageView2.setImageResource(R.drawable.image8)
            R.string.sup4-> imageView2.setImageResource(R.drawable.image9)
            R.string.second1-> imageView2.setImageResource(R.drawable.image10)
            R.string.second2-> imageView2.setImageResource(R.drawable.image11)
            R.string.second3-> imageView2.setImageResource(R.drawable.image12)

        }
    }
}
