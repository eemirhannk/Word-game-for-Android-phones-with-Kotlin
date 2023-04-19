package com.example.yazlab2_2

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.widget.EditText
import android.widget.TextView
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
        onClicks()

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
    private fun onClicks() {
        val editText = findViewById<EditText>(R.id.edit_text)
        val b1 = findViewById<TextView>(R.id.B1)
        val b2 = findViewById<TextView>(R.id.B2)
        val b3 = findViewById<TextView>(R.id.B3)
        val b4 = findViewById<TextView>(R.id.B4)
        val b5 = findViewById<TextView>(R.id.B5)
        val b6 = findViewById<TextView>(R.id.B6)
        val b7 = findViewById<TextView>(R.id.B7)
        val b8 = findViewById<TextView>(R.id.B8)
        val b9 = findViewById<TextView>(R.id.B9)
        val b10 = findViewById<TextView>(R.id.B10)
        val b11 = findViewById<TextView>(R.id.B11)
        val b12 = findViewById<TextView>(R.id.B12)
        val b13 = findViewById<TextView>(R.id.B13)
        val b14 = findViewById<TextView>(R.id.B14)
        val b15 = findViewById<TextView>(R.id.B15)
        val b16 = findViewById<TextView>(R.id.B16)
        val b17 = findViewById<TextView>(R.id.B17)
        val b18 = findViewById<TextView>(R.id.B18)
        val b19 = findViewById<TextView>(R.id.B19)
        val b20 = findViewById<TextView>(R.id.B20)
        val b21 = findViewById<TextView>(R.id.B21)
        val b22 = findViewById<TextView>(R.id.B22)
        val b23 = findViewById<TextView>(R.id.B23)
        val b24 = findViewById<TextView>(R.id.B24)
        val b25 = findViewById<TextView>(R.id.B25)
        val b26 = findViewById<TextView>(R.id.B26)
        val b27 = findViewById<TextView>(R.id.B27)
        val b28 = findViewById<TextView>(R.id.B28)
        val b29 = findViewById<TextView>(R.id.B29)
        val b30 = findViewById<TextView>(R.id.B30)
        val b31 = findViewById<TextView>(R.id.B31)
        val b32 = findViewById<TextView>(R.id.B32)
        val b33 = findViewById<TextView>(R.id.B33)
        val b34 = findViewById<TextView>(R.id.B34)
        val b35 = findViewById<TextView>(R.id.B35)
        val b36 = findViewById<TextView>(R.id.B36)
        val b37 = findViewById<TextView>(R.id.B37)
        val b38 = findViewById<TextView>(R.id.B38)
        val b39 = findViewById<TextView>(R.id.B39)
        val b40 = findViewById<TextView>(R.id.B40)
        val b41 = findViewById<TextView>(R.id.B41)
        val b42 = findViewById<TextView>(R.id.B42)
        val b43 = findViewById<TextView>(R.id.B43)
        val b44 = findViewById<TextView>(R.id.B44)
        val b45 = findViewById<TextView>(R.id.B45)
        val b46 = findViewById<TextView>(R.id.B46)
        val b47 = findViewById<TextView>(R.id.B47)
        val b48 = findViewById<TextView>(R.id.B48)
        val b49 = findViewById<TextView>(R.id.B49)
        val b50 = findViewById<TextView>(R.id.B50)
        val b51 = findViewById<TextView>(R.id.B51)
        val b52 = findViewById<TextView>(R.id.B52)
        val b53 = findViewById<TextView>(R.id.B53)
        val b54 = findViewById<TextView>(R.id.B54)
        val b55 = findViewById<TextView>(R.id.B55)
        val b56 = findViewById<TextView>(R.id.B56)
        val b57 = findViewById<TextView>(R.id.B57)
        val b58 = findViewById<TextView>(R.id.B58)
        val b59 = findViewById<TextView>(R.id.B59)
        val b60 = findViewById<TextView>(R.id.B60)
        val b61 = findViewById<TextView>(R.id.B61)
        val b62 = findViewById<TextView>(R.id.B62)
        val b63 = findViewById<TextView>(R.id.B63)
        val b64 = findViewById<TextView>(R.id.B64)
        val b65 = findViewById<TextView>(R.id.B65)
        val b66 = findViewById<TextView>(R.id.B66)
        val b67 = findViewById<TextView>(R.id.B67)
        val b68 = findViewById<TextView>(R.id.B68)
        val b69 = findViewById<TextView>(R.id.B69)
        val b70 = findViewById<TextView>(R.id.B70)
        val b71 = findViewById<TextView>(R.id.B71)
        val b72 = findViewById<TextView>(R.id.B72)
        val b73 = findViewById<TextView>(R.id.B73)
        val b74 = findViewById<TextView>(R.id.B74)
        val b75 = findViewById<TextView>(R.id.B75)
        val b76 = findViewById<TextView>(R.id.B76)
        val b77 = findViewById<TextView>(R.id.B77)
        val b78 = findViewById<TextView>(R.id.B78)
        val b79 = findViewById<TextView>(R.id.B79)
        val b80 = findViewById<TextView>(R.id.B80)

        val buttons = arrayOf(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59, b60, b61, b62, b63, b64, b65, b66, b67, b68, b69, b70, b71, b72, b73, b74, b75, b76, b77, b78, b79, b80)

        for (button in buttons) {
            button.setOnClickListener {
                val text = button.text.toString()
                val currentText = editText.text.toString()
                editText.setText("$currentText$text")
            }
        }
    }


    private fun next_shape(){
        findViewById<TextView>(R.id.B1).text = randomChar().toString();findViewById<TextView>(R.id.B2).text = randomChar().toString();findViewById<TextView>(R.id.B3).text = randomChar().toString();findViewById<TextView>(R.id.B4).text = randomChar().toString();findViewById<TextView>(R.id.B5).text = randomChar().toString();findViewById<TextView>(R.id.B6).text = randomChar().toString();findViewById<TextView>(R.id.B7).text = randomChar().toString();findViewById<TextView>(R.id.B8).text = randomChar().toString();
        findViewById<TextView>(R.id.B9).text = randomChar().toString();findViewById<TextView>(R.id.B10).text = randomChar().toString();findViewById<TextView>(R.id.B11).text = randomChar().toString();findViewById<TextView>(R.id.B12).text = randomChar().toString();findViewById<TextView>(R.id.B13).text = randomChar().toString();findViewById<TextView>(R.id.B14).text = randomChar().toString();findViewById<TextView>(R.id.B15).text = randomChar().toString();findViewById<TextView>(R.id.B16).text = randomChar().toString();
        findViewById<TextView>(R.id.B17).text = randomChar().toString();findViewById<TextView>(R.id.B18).text = randomChar().toString();findViewById<TextView>(R.id.B19).text = randomChar().toString();findViewById<TextView>(R.id.B20).text = randomChar().toString();findViewById<TextView>(R.id.B21).text = randomChar().toString();findViewById<TextView>(R.id.B22).text = randomChar().toString();findViewById<TextView>(R.id.B23).text = randomChar().toString();findViewById<TextView>(R.id.B24).text = randomChar().toString();
        findViewById<TextView>(R.id.B1).text = randomChar().toString();findViewById<TextView>(R.id.B2).text = randomChar().toString();findViewById<TextView>(R.id.B3).text = randomChar().toString();findViewById<TextView>(R.id.B4).text = randomChar().toString();findViewById<TextView>(R.id.B5).text = randomChar().toString();findViewById<TextView>(R.id.B6).text = randomChar().toString();findViewById<TextView>(R.id.B7).text = randomChar().toString();findViewById<TextView>(R.id.B8).text = randomChar().toString();
        findViewById<TextView>(R.id.B9).text = randomChar().toString();findViewById<TextView>(R.id.B10).text = randomChar().toString();findViewById<TextView>(R.id.B11).text = randomChar().toString();findViewById<TextView>(R.id.B12).text = randomChar().toString();findViewById<TextView>(R.id.B13).text = randomChar().toString();findViewById<TextView>(R.id.B14).text = randomChar().toString();findViewById<TextView>(R.id.B15).text = randomChar().toString();findViewById<TextView>(R.id.B16).text = randomChar().toString();
        findViewById<TextView>(R.id.B17).text = randomChar().toString();findViewById<TextView>(R.id.B18).text = randomChar().toString();findViewById<TextView>(R.id.B19).text = randomChar().toString();findViewById<TextView>(R.id.B20).text = randomChar().toString();findViewById<TextView>(R.id.B21).text = randomChar().toString();findViewById<TextView>(R.id.B22).text = randomChar().toString();findViewById<TextView>(R.id.B23).text = randomChar().toString();findViewById<TextView>(R.id.B24).text = randomChar().toString();
        findViewById<TextView>(R.id.B1).text = randomChar().toString();findViewById<TextView>(R.id.B2).text = randomChar().toString();findViewById<TextView>(R.id.B3).text = randomChar().toString();findViewById<TextView>(R.id.B4).text = randomChar().toString();findViewById<TextView>(R.id.B5).text = randomChar().toString();findViewById<TextView>(R.id.B6).text = randomChar().toString();findViewById<TextView>(R.id.B7).text = randomChar().toString();findViewById<TextView>(R.id.B8).text = randomChar().toString();
        findViewById<TextView>(R.id.B9).text = randomChar().toString();findViewById<TextView>(R.id.B10).text = randomChar().toString();findViewById<TextView>(R.id.B11).text = randomChar().toString();findViewById<TextView>(R.id.B12).text = randomChar().toString();findViewById<TextView>(R.id.B13).text = randomChar().toString();findViewById<TextView>(R.id.B14).text = randomChar().toString();findViewById<TextView>(R.id.B15).text = randomChar().toString();findViewById<TextView>(R.id.B16).text = randomChar().toString();
        findViewById<TextView>(R.id.B17).text = randomChar().toString();findViewById<TextView>(R.id.B18).text = randomChar().toString();findViewById<TextView>(R.id.B19).text = randomChar().toString();findViewById<TextView>(R.id.B20).text = randomChar().toString();findViewById<TextView>(R.id.B21).text = randomChar().toString();findViewById<TextView>(R.id.B22).text = randomChar().toString();findViewById<TextView>(R.id.B23).text = randomChar().toString();findViewById<TextView>(R.id.B24).text = randomChar().toString();

        val random = Random.nextInt(1..8)
        when(random){

            1 -> {findViewById<TextView>(R.id.B1).text = randomChar().toString()}
            2 -> {findViewById<TextView>(R.id.B2).text = randomChar().toString()}
            3 -> {findViewById<TextView>(R.id.B3).text = randomChar().toString()}
            4 -> {findViewById<TextView>(R.id.B4).text = randomChar().toString()}
            5 -> {findViewById<TextView>(R.id.B5).text = randomChar().toString()}
            6 -> {findViewById<TextView>(R.id.B6).text = randomChar().toString()}
            7 -> {findViewById<TextView>(R.id.B7).text = randomChar().toString()}
            8 -> {findViewById<TextView>(R.id.B8).text = randomChar().toString()}
        }

    }


}