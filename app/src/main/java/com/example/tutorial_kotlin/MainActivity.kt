package com.example.tutorial_kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val vraiButton = findViewById<Button>(R.id.vrai)
        vraiButton.setOnClickListener{
            Toast.makeText(this, "❌ Mauvaise Réponse", Toast.LENGTH_SHORT).show()
        }
        val fauxButton = findViewById<Button>(R.id.faux)
        fauxButton.setOnClickListener{
            Toast.makeText(this, "✔️ Bonne Réponse", Toast.LENGTH_SHORT).show()
        }

    }
}