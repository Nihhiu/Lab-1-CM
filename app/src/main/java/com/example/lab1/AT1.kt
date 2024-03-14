package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AT1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.button_at1_to_at2)
        buttonClick.setOnClickListener {
            val intent = Intent(this, AT2::class.java)
            startActivity(intent)
        }
    }

}