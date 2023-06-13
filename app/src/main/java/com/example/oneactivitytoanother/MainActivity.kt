package com.example.oneactivitytoanother

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name=findViewById<EditText>(R.id.name)
        val age=findViewById<EditText>(R.id.age)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("a",name.text.toString())
            intent.putExtra("b",age.text.toString())
            startActivity(intent)
        }
    }
}