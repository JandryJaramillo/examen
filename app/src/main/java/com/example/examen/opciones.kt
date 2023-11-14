package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class opciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)
        llamarbt1()
        llamarbt2()
    }


    private fun llamarbt2() {
        val bt2 = findViewById<Button>(R.id.fotos)

        bt2.setOnClickListener {
            val next: Intent = Intent(this, fotos::class.java)
            startActivity(next)
        }
    }

    private fun llamarbt1() {
        val bt2 = findViewById<Button>(R.id.registro)

        bt2.setOnClickListener {
            val next: Intent = Intent(this, fotos::class.java)
            startActivity(next)
        }
    }
}