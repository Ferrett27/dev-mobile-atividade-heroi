package com.example.seuheroi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pergunta1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta1)

        val opcao1 = findViewById<Button>(R.id.opcao1)
        val opcao2 = findViewById<Button>(R.id.opcao2)

        opcao1.setOnClickListener {
            val resultado = "A"
            val intent = Intent(this, Pergunta2::class.java)
            intent.putExtra("resultado", resultado)
            startActivity(intent)
        }
        opcao2.setOnClickListener {
            val resultado = "B"
            val intent = Intent(this, Pergunta2::class.java)
            intent.putExtra("resultado", resultado)
            startActivity(intent)
        }
    }
}