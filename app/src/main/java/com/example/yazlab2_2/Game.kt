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


}