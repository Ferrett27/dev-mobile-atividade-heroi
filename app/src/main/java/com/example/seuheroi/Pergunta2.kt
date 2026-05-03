package com.example.seuheroi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pergunta2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta2)

        val opcao1 = findViewById<Button>(R.id.opcao1)
        val opcao2 = findViewById<Button>(R.id.opcao2)
        var resultado = intent.getStringExtra("resultado")

        opcao1.setOnClickListener {
            resultado += "A"
            val intent = Intent(this, Pergunta3::class.java)
            intent.putExtra("resultado", resultado)
            startActivity(intent)
        }
        opcao2.setOnClickListener {
            resultado += "B"
            val intent = Intent(this, Pergunta3::class.java)
            intent.putExtra("resultado", resultado)
            startActivity(intent)
        }
    }
}