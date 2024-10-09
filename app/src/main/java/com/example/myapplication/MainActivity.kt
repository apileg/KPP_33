package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Обробка кнопки "Інформація про автора"
        findViewById<Button>(R.id.buttonAuthor).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("info", "Author: Shapoval Oleg")
            startActivity(intent)
        }

        // Обробка кнопки "Інформація про факультет"
        findViewById<Button>(R.id.buttonFaculty).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("info", "Faculty: Інформаційних технологій")
            startActivity(intent)
        }

        // Обробка кнопки "Інформація про місто"
        findViewById<Button>(R.id.buttonCity).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("info", "City: Київ")
            startActivity(intent)
        }
    }
}
