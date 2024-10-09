package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Отримання інформації з MainActivity
        val info = intent.getStringExtra("info")
        findViewById<TextView>(R.id.textViewInfo).text = info

        // Дія для кнопки "Назад"
        findViewById<Button>(R.id.buttonBack).setOnClickListener {
            // Повертаємося до MainActivity
            finish()  // Завершуємо поточну активність, повертаємось до попередньої
        }
    }
}
