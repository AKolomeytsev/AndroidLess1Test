package com.example.androidless1test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textGreeting = findViewById<TextView>(R.id.firstScreenText)
        textGreeting.text = "Привет Мир! Я запустил первой приложение в Android!!!"

        val headBottom = findViewById<Button>(R.id.headBottom)
        headBottom.setOnClickListener(View.OnClickListener {
            textGreeting.text = "Нажатие проверили!!!"
        })

    }
}