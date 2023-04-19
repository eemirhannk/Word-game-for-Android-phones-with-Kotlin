package com.example.yazlab2_2

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import kotlinx.coroutines.delay
import kotlin.random.Random
import kotlin.random.nextInt


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

    fun randomChar(): Char {
        val chars = "ABCÇDEFGHIİJKLMNOÖPRSŞTUÜVYZ"
        val index = (0..chars.length-1).random()
        return chars[index]
    }


    private fun next_shape(){
        findViewById<Button>(R.id.B1).text = randomChar().toString();findViewById<Button>(R.id.B2).text = randomChar().toString();findViewById<Button>(R.id.B3).text = randomChar().toString();findViewById<Button>(R.id.B4).text = randomChar().toString();findViewById<Button>(R.id.B5).text = randomChar().toString();findViewById<Button>(R.id.B6).text = randomChar().toString();findViewById<Button>(R.id.B7).text = randomChar().toString();findViewById<Button>(R.id.B8).text = randomChar().toString();
        findViewById<Button>(R.id.B9).text = randomChar().toString();findViewById<Button>(R.id.B10).text = randomChar().toString();findViewById<Button>(R.id.B11).text = randomChar().toString();findViewById<Button>(R.id.B12).text = randomChar().toString();findViewById<Button>(R.id.B13).text = randomChar().toString();findViewById<Button>(R.id.B14).text = randomChar().toString();findViewById<Button>(R.id.B15).text = randomChar().toString();findViewById<Button>(R.id.B16).text = randomChar().toString();
        findViewById<Button>(R.id.B17).text = randomChar().toString();findViewById<Button>(R.id.B18).text = randomChar().toString();findViewById<Button>(R.id.B19).text = randomChar().toString();findViewById<Button>(R.id.B20).text = randomChar().toString();findViewById<Button>(R.id.B21).text = randomChar().toString();findViewById<Button>(R.id.B22).text = randomChar().toString();findViewById<Button>(R.id.B23).text = randomChar().toString();findViewById<Button>(R.id.B24).text = randomChar().toString();
        findViewById<Button>(R.id.B1).text = randomChar().toString();findViewById<Button>(R.id.B2).text = randomChar().toString();findViewById<Button>(R.id.B3).text = randomChar().toString();findViewById<Button>(R.id.B4).text = randomChar().toString();findViewById<Button>(R.id.B5).text = randomChar().toString();findViewById<Button>(R.id.B6).text = randomChar().toString();findViewById<Button>(R.id.B7).text = randomChar().toString();findViewById<Button>(R.id.B8).text = randomChar().toString();
        findViewById<Button>(R.id.B9).text = randomChar().toString();findViewById<Button>(R.id.B10).text = randomChar().toString();findViewById<Button>(R.id.B11).text = randomChar().toString();findViewById<Button>(R.id.B12).text = randomChar().toString();findViewById<Button>(R.id.B13).text = randomChar().toString();findViewById<Button>(R.id.B14).text = randomChar().toString();findViewById<Button>(R.id.B15).text = randomChar().toString();findViewById<Button>(R.id.B16).text = randomChar().toString();
        findViewById<Button>(R.id.B17).text = randomChar().toString();findViewById<Button>(R.id.B18).text = randomChar().toString();findViewById<Button>(R.id.B19).text = randomChar().toString();findViewById<Button>(R.id.B20).text = randomChar().toString();findViewById<Button>(R.id.B21).text = randomChar().toString();findViewById<Button>(R.id.B22).text = randomChar().toString();findViewById<Button>(R.id.B23).text = randomChar().toString();findViewById<Button>(R.id.B24).text = randomChar().toString();
        findViewById<Button>(R.id.B1).text = randomChar().toString();findViewById<Button>(R.id.B2).text = randomChar().toString();findViewById<Button>(R.id.B3).text = randomChar().toString();findViewById<Button>(R.id.B4).text = randomChar().toString();findViewById<Button>(R.id.B5).text = randomChar().toString();findViewById<Button>(R.id.B6).text = randomChar().toString();findViewById<Button>(R.id.B7).text = randomChar().toString();findViewById<Button>(R.id.B8).text = randomChar().toString();
        findViewById<Button>(R.id.B9).text = randomChar().toString();findViewById<Button>(R.id.B10).text = randomChar().toString();findViewById<Button>(R.id.B11).text = randomChar().toString();findViewById<Button>(R.id.B12).text = randomChar().toString();findViewById<Button>(R.id.B13).text = randomChar().toString();findViewById<Button>(R.id.B14).text = randomChar().toString();findViewById<Button>(R.id.B15).text = randomChar().toString();findViewById<Button>(R.id.B16).text = randomChar().toString();
        findViewById<Button>(R.id.B17).text = randomChar().toString();findViewById<Button>(R.id.B18).text = randomChar().toString();findViewById<Button>(R.id.B19).text = randomChar().toString();findViewById<Button>(R.id.B20).text = randomChar().toString();findViewById<Button>(R.id.B21).text = randomChar().toString();findViewById<Button>(R.id.B22).text = randomChar().toString();findViewById<Button>(R.id.B23).text = randomChar().toString();findViewById<Button>(R.id.B24).text = randomChar().toString();


        val random = Random.nextInt(1..8)
        when(random){
            1 -> {findViewById<Button>(R.id.B1).text = randomChar().toString()}
            2 -> {findViewById<Button>(R.id.B2).text = randomChar().toString()}
            3 -> {findViewById<Button>(R.id.B3).text = randomChar().toString()}
            4 -> {findViewById<Button>(R.id.B4).text = randomChar().toString()}
            5 -> {findViewById<Button>(R.id.B5).text = randomChar().toString()}
            6 -> {findViewById<Button>(R.id.B6).text = randomChar().toString()}
            7 -> {findViewById<Button>(R.id.B7).text = randomChar().toString()}
            8 -> {findViewById<Button>(R.id.B8).text = randomChar().toString()}
        }

    }


}