package com.example.yazlab2_2

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_main)
        val startColor = Color.BLACK
        val endColor = Color.BLUE

        val gradientDrawable = GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, intArrayOf(startColor, endColor))
        window.decorView.background = gradientDrawable

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, Game::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage("Uygulamadan çıkmak istediğinizden emin misiniz?")
                .setPositiveButton("Evet") { _, _ ->
                    finish()
                    Toast.makeText(this, "Çıkış yapıldı", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Hayır", null)
                .show()
        }




    }
}