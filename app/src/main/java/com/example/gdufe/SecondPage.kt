package com.example.gdufe

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SecondPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val imageView = findViewById<ImageView>(R.id.secondImage)
        var bitmap: Bitmap = BitmapFactory.decodeResource(resources, R.mipmap.playground_foreground)
        imageView.setImageBitmap(bitmap)
        val button = findViewById<Button>(R.id.showNext)
        button.setOnClickListener {
            val intent = Intent(this,ThridPage::class.java)
            startActivity(intent)
        }
    }
}