package com.example.gdufe

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toPlayground = findViewById<Button>(R.id.nextPage)
        val imageView = findViewById<ImageView>(R.id.backimage)
        var bitmap: Bitmap = BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher_foreground)
        imageView.setImageBitmap(bitmap)
        toPlayground.setOnClickListener {
            val intent = Intent(this,SecondPage::class.java)
            startActivity(intent)
        }
    }
}