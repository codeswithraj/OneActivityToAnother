package com.example.oneactivitytoanother

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val name=findViewById<TextView>(R.id.names)
        val age=findViewById<TextView>(R.id.ages)
        val names =intent.getStringExtra("a")
        name.text=names

        age.text=intent.getStringExtra("b")

    }
}