package com.example.yazlab2_2

import android.bluetooth.BluetoothA2dp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager


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
        B1.setBackgroundResource(R.drawable.red);B2.setBackgroundResource(R.drawable.red);B3.setBackgroundResource(R.drawable.red);B4.setBackgroundResource(R.drawable.red);B5.setBackgroundResource(R.drawable.red);B6.setBackgroundResource(R.drawable.red);B7.setBackgroundResource(R.drawable.red);B8.setBackgroundResource(R.drawable.red);
        B9.setBackgroundResource(R.drawable.red);B10.setBackgroundResource(R.drawable.red);B11.setBackgroundResource(R.drawable.red);B12.setBackgroundResource(R.drawable.red);B13.setBackgroundResource(R.drawable.red);B14.setBackgroundResource(R.drawable.red);B15.setBackgroundResource(R.drawable.red);B16.setBackgroundResource(R.drawable.red);
        B17.setBackgroundResource(R.drawable.red);B18.setBackgroundResource(R.drawable.red);B19.setBackgroundResource(R.drawable.red);B20.setBackgroundResource(R.drawable.red);B21.setBackgroundResource(R.drawable.red);B22.setBackgroundResource(R.drawable.red);B23.setBackgroundResource(R.drawable.red);B24.setBackgroundResource(R.drawable.red);
    }


}