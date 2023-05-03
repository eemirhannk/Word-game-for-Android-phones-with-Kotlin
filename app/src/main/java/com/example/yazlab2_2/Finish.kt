package com.example.yazlab2_2

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Finish : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar()?.hide();
        setContentView(R.layout.finish)

        val intent = intent
        val sonuc = intent.getStringExtra("sonuc")

        val myTextView = findViewById<TextView>(R.id.sonucEkraniSkoru)
        myTextView.setText(sonuc)



    }

}