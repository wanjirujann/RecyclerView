package com.example.myrecyclerview

import NamesRecyclerViewAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import student

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView:RecyclerView=findViewById(R.id.rvNames)
        val lm = LinearLayoutManager(this)
        recyclerView.layoutManager=lm
        recyclerView.hasFixedSize()
        val people= mutableListOf<student>()
        people.add(student("Jann","21/6/1999","Crotcheting"))

        val hello=NamesRecyclerViewAdapter(people)
        recyclerView.adapter = hello
    }
}