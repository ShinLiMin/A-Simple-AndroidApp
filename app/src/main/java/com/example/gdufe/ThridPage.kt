package com.example.gdufe

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ThridPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gate_page)
        val imageView = findViewById<ImageView>(R.id.imageView)
        var bitmap: Bitmap = BitmapFactory.decodeResource(resources, R.mipmap.gate_foreground)
        imageView.setImageBitmap(bitmap)
    }
}