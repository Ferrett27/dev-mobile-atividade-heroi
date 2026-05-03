package com.example.seuheroi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoInicial = findViewById<Button>(R.id.botaoInicial)

        botaoInicial.setOnClickListener {
            val intent = Intent(this, Pergunta1::class.java)
            startActivity(intent)
        }

    }
}