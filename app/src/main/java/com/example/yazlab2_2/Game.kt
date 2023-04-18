package com.example.yazlab2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import kotlin.random.Random


class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar()?.hide();

        setContentView(R.layout.game)

        next_shape()

    }

    var nextUp:Int = 0
    var starting = 0
    var num1 = 0
    var num2 = 0
    var num3 = 0
    var num4 = 0
    var shape_is = 0
    var stop = 0
    var lines = 0
    var once = 0

    private fun next_shape(){
        findViewById<TextView>(R.id.B1).text = "D";findViewById<TextView>(R.id.B2).text = "D";findViewById<TextView>(R.id.B3).text = "D";findViewById<TextView>(R.id.B4).text = "D";findViewById<TextView>(R.id.B5).text = "D";findViewById<TextView>(R.id.B6).text = "D";findViewById<TextView>(R.id.B7).text = "D";findViewById<TextView>(R.id.B8).text = "D";
        findViewById<TextView>(R.id.B9).text = "D";findViewById<TextView>(R.id.B10).text = "D";findViewById<TextView>(R.id.B11).text = "D";findViewById<TextView>(R.id.B12).text = "D";findViewById<TextView>(R.id.B13).text = "D";findViewById<TextView>(R.id.B14).text = "D";findViewById<TextView>(R.id.B15).text = "D";findViewById<TextView>(R.id.B16).text = "D";
        findViewById<TextView>(R.id.B17).text = "D";findViewById<TextView>(R.id.B18).text = "D";findViewById<TextView>(R.id.B19).text = "D";findViewById<TextView>(R.id.B20).text = "D";findViewById<TextView>(R.id.B21).text = "D";findViewById<TextView>(R.id.B22).text = "D";findViewById<TextView>(R.id.B23).text = "D";findViewById<TextView>(R.id.B24).text = "D";


    }


}