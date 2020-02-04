package com.example.recyclertest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layoutManagerr=LinearLayoutManager(this)
        layoutManagerr.orientation=LinearLayoutManager.VERTICAL
        recyclerView.layoutManager=layoutManagerr

        val adapter=DataAdapter(this,Supplier.hobbies)
        recyclerView.adapter=adapter
    }
}
