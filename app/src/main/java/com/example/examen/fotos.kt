package com.example.examen

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class fotos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fotos)
        llamarbt1()

        val btnCam = findViewById<Button>(R.id.fotos2)

        btnCam.setOnClickListener {
            startForResult.launch(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
        }

    }

    private val startForResult =registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            result: ActivityResult ->
        if (result.resultCode == Activity.RESULT_OK){
            val intent = result.data
            val imagBitmap = intent?.extras?.get("data") as Bitmap
            val imageView = findViewById<ImageView>(R.id.imageView6)
            val imageView2 = findViewById<ImageView>(R.id.imageView7)
            imageView.setImageBitmap(imagBitmap)
            MediaStore.Images.Media.insertImage(
                contentResolver,
                imagBitmap,
                "Pic",
                "foto nueva"
            )
        }
    }

    private fun llamarbt1() {
        val bt2 = findViewById<Button>(R.id.regresar)

        bt2.setOnClickListener {
            val next: Intent = Intent(this, opciones::class.java)
            startActivity(next)
        }
    }
}