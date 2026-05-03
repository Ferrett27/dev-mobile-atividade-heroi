package com.example.seuheroi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textoResultado = findViewById<TextView>(R.id.textoResultado)
        val imagemResultado = findViewById<ImageView>(R.id.imagemResultado)
        val botaoRefazer = findViewById<Button>(R.id.botaoRefazer)
        val resultado = intent.getStringExtra("resultado")

        if (resultado != null) {
            if (resultado == "AAA") {
                textoResultado.text = "Batman"
                imagemResultado.setImageResource(R.drawable.batman)
            } else if (resultado == "AAB") {
                textoResultado.text = "Justiceiro"
                imagemResultado.setImageResource(R.drawable.justiceiro)
            } else if (resultado == "ABA") {
                textoResultado.text = "Homem-Formiga"
                imagemResultado.setImageResource(R.drawable.homem_formiga)
            } else if (resultado == "ABB") {
                textoResultado.text = "Homem de Ferro"
                imagemResultado.setImageResource(R.drawable.homem_de_ferro)
            } else if (resultado == "BAA") {
                textoResultado.text = "Wolverine"
                imagemResultado.setImageResource(R.drawable.wolverine)
            } else if (resultado == "BAB") {
                textoResultado.text = "Motoqueiro Fantasma"
                imagemResultado.setImageResource(R.drawable.motoqueiro_fantasma)
            } else if (resultado == "BBA") {
                textoResultado.text = "Homem-Aranha"
                imagemResultado.setImageResource(R.drawable.homem_aranha)
            } else if (resultado == "BBB") {
                textoResultado.text = "Thor"
                imagemResultado.setImageResource(R.drawable.thor)
            } else {
                textoResultado.text = "Herói Desconhecido"
                imagemResultado.setImageResource(R.drawable.desconhecido)
            }
        }

        botaoRefazer.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}