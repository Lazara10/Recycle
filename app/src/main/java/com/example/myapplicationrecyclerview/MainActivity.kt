package com.example.myapplicationrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf<image>(
            image("C programming", R.drawable.cprogrr),
            image("C ++", R.drawable.cplu),
            image("Java", R.drawable.java),
            image("Phyton", R.drawable.phyton),
            image("Boot", R.drawable.boot),
            image("Asp.Net", R.drawable.aspn),
            image("PHP", R.drawable.php),
            image("Unix", R.drawable.ping),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.ImagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, images)
    }
}