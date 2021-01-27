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
            image("Images1", R.drawable.djoker),
            image("Images2", R.drawable.basila),
            image("Images3", R.drawable.nadal),
            image("Images4", R.drawable.roger),
            image("Images5", R.drawable.agut),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.ImagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, images)
    }
}