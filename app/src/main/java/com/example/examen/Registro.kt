package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        llamarbt1()
        llamarbt2()
    }

    private fun llamarbt1() {
        val bt2 = findViewById<Button>(R.id.login)

        bt2.setOnClickListener {
            val next: Intent = Intent(this, MainActivity::class.java)
            startActivity(next)
        }
    }

    private fun llamarbt2() {
        val bt2 = findViewById<Button>(R.id.ingresar)

        bt2.setOnClickListener {
            val next: Intent = Intent(this, opciones::class.java)
            startActivity(next)
        }
    }
}