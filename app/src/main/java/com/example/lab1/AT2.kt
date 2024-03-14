package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val buttonClick = findViewById<Button>(R.id.button_at2_close)
        buttonClick.setOnClickListener {
            finish()
            System.exit(0)
        }
    }
}