package com.example.yazlab2_2

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.GridLayout
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.coroutines.delay
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.time.Duration
import java.util.*
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.concurrent.scheduleAtFixedRate
import kotlin.concurrent.timerTask


class Game : AppCompatActivity() {
    var counter = 0;
    var sayac = 0


    //otomatik düsme icin tanımlanmıs bir cronjobın yöneticisi
    fun autoDownCronJobManager() {
        println("Program Başladı")
        // Zamanlanmış fonksiyon çağırma
        Timer().schedule(object : TimerTask() {
            override fun run() {

                //  8 thread ile aynı anda çalıştır
                println("Zamanlanmış fonksiyon çağırıldı")
                autoDownCronJobB1()
                autoDownCronJobB2()
                autoDownCronJobB3()
                autoDownCronJobB4()
                autoDownCronJobB5()
                autoDownCronJobB6()
                autoDownCronJobB7()
                autoDownCronJobB8()

            }
        }, 3000, 500) // 5000 milisaniye (5 saniye) sonra çağrılacak
        println("Program Devam Ediyor")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        getSupportActionBar()?.hide();

        setContentView(R.layout.game)

        next_shape()
        randomWordSender()
        onClicks()
        autoDownCronJobManager()


        val clickedButton = findViewById(R.id.correctTextView) as Button
        clickedButton.setOnClickListener {
            var edit_text = (findViewById<View>(R.id.edit_text)) as TextView
            var isWordCorrectResult = isWordCorrect(edit_text.text)
        }
        val secondClickedButton = findViewById(R.id.wrongTextView) as Button
        secondClickedButton.setOnClickListener {
            var edit_text = (findViewById<View>(R.id.edit_text)) as TextView
            edit_text.text = ""
        }
        val startColor = Color.BLACK
        val endColor = Color.BLUE

        val gradientDrawable = GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, intArrayOf(startColor, endColor))
        window.decorView.background = gradientDrawable


    }

    private fun randomWordSender() {
        //ilk 3 satır düştükten sonra 15 saniyede bir random harf düşüren fonksiyon.
        val handler = Handler()
        val runnable = object : Runnable {
            override fun run() {
                val random = Random.nextInt(1..16)
                when (random) {

                    1 -> {
                        findViewById<TextView>(R.id.B1).text = randomChar().toString()
                    }

                    2 -> {
                        findViewById<TextView>(R.id.B2).text = randomChar().toString()
                    }

                    3 -> {
                        findViewById<TextView>(R.id.B3).text = randomChar().toString()
                    }

                    4 -> {
                        findViewById<TextView>(R.id.B4).text = randomChar().toString()
                    }

                    5 -> {
                        findViewById<TextView>(R.id.B5).text = randomChar().toString()
                    }

                    6 -> {
                        findViewById<TextView>(R.id.B6).text = randomChar().toString()
                    }

                    7 -> {
                        findViewById<TextView>(R.id.B7).text = randomChar().toString()
                    }

                    8 -> {
                        findViewById<TextView>(R.id.B8).text = randomChar().toString()
                    }
                }
                // Fonksiyonun yapması gereken işlemler burada yer alır

                handler.postDelayed(this, 5000) // 5 saniye sonra tekrar çağır
            }
        }

        handler.postDelayed(runnable, 15000) // 5 saniye sonra çağır


    }


    fun autoDownCronJobB1(): String {
        if (findViewById<TextView>(R.id.B1).text != "" && findViewById<TextView>(R.id.B9).text == "") {
            val B1Char = findViewById<TextView>(R.id.B1).text
            findViewById<TextView>(R.id.B1).text = ""
            findViewById<TextView>(R.id.B9).text = B1Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B9).text != "" && findViewById<TextView>(R.id.B17).text == "") {
            val B9Char = findViewById<TextView>(R.id.B9).text
            findViewById<TextView>(R.id.B9).text = ""
            findViewById<TextView>(R.id.B17).text = B9Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B17).text != "" && findViewById<TextView>(R.id.B25).text == "") {
            val B17Char = findViewById<TextView>(R.id.B17).text
            findViewById<TextView>(R.id.B17).text = ""
            findViewById<TextView>(R.id.B25).text = B17Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B25).text != "" && findViewById<TextView>(R.id.B33).text == "") {
            val B25Char = findViewById<TextView>(R.id.B25).text
            findViewById<TextView>(R.id.B25).text = ""
            findViewById<TextView>(R.id.B33).text = B25Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B33).text != "" && findViewById<TextView>(R.id.B41).text == "") {
            val B25Char = findViewById<TextView>(R.id.B33).text
            findViewById<TextView>(R.id.B33).text = ""
            findViewById<TextView>(R.id.B41).text = B25Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B41).text != "" && findViewById<TextView>(R.id.B49).text == "") {
            val B25Char = findViewById<TextView>(R.id.B41).text
            findViewById<TextView>(R.id.B41).text = ""
            findViewById<TextView>(R.id.B49).text = B25Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B49).text != "" && findViewById<TextView>(R.id.B57).text == "") {
            val B25Char = findViewById<TextView>(R.id.B49).text
            findViewById<TextView>(R.id.B49).text = ""
            findViewById<TextView>(R.id.B57).text = B25Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B57).text != "" && findViewById<TextView>(R.id.B65).text == "") {
            val B25Char = findViewById<TextView>(R.id.B57).text
            findViewById<TextView>(R.id.B57).text = ""
            findViewById<TextView>(R.id.B65).text = B25Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B65).text != "" && findViewById<TextView>(R.id.B73).text == "") {
            val B25Char = findViewById<TextView>(R.id.B65).text
            findViewById<TextView>(R.id.B65).text = ""
            findViewById<TextView>(R.id.B73).text = B25Char
        }
        Thread.sleep(40)

        return "";
    }

    fun autoDownCronJobB2(): String {
        if (findViewById<TextView>(R.id.B2).text != "" && findViewById<TextView>(R.id.B10).text == "") {
            val B2Char = findViewById<TextView>(R.id.B2).text
            findViewById<TextView>(R.id.B2).text = ""
            findViewById<TextView>(R.id.B10).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B10).text != "" && findViewById<TextView>(R.id.B18).text == "") {
            val B2Char = findViewById<TextView>(R.id.B10).text
            findViewById<TextView>(R.id.B10).text = ""
            findViewById<TextView>(R.id.B18).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B18).text != "" && findViewById<TextView>(R.id.B26).text == "") {
            val B2Char = findViewById<TextView>(R.id.B18).text
            findViewById<TextView>(R.id.B18).text = ""
            findViewById<TextView>(R.id.B26).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B26).text != "" && findViewById<TextView>(R.id.B34).text == "") {
            val B2Char = findViewById<TextView>(R.id.B26).text
            findViewById<TextView>(R.id.B26).text = ""
            findViewById<TextView>(R.id.B34).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B34).text != "" && findViewById<TextView>(R.id.B42).text == "") {
            val B2Char = findViewById<TextView>(R.id.B34).text
            findViewById<TextView>(R.id.B34).text = ""
            findViewById<TextView>(R.id.B42).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B42).text != "" && findViewById<TextView>(R.id.B50).text == "") {
            val B2Char = findViewById<TextView>(R.id.B42).text
            findViewById<TextView>(R.id.B42).text = ""
            findViewById<TextView>(R.id.B50).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B50).text != "" && findViewById<TextView>(R.id.B58).text == "") {
            val B2Char = findViewById<TextView>(R.id.B50).text
            findViewById<TextView>(R.id.B50).text = ""
            findViewById<TextView>(R.id.B58).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B58).text != "" && findViewById<TextView>(R.id.B66).text == "") {
            val B2Char = findViewById<TextView>(R.id.B58).text
            findViewById<TextView>(R.id.B58).text = ""
            findViewById<TextView>(R.id.B66).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B66).text != "" && findViewById<TextView>(R.id.B74).text == "") {
            val B2Char = findViewById<TextView>(R.id.B66).text
            findViewById<TextView>(R.id.B66).text = ""
            findViewById<TextView>(R.id.B74).text = B2Char
        }
        Thread.sleep(40)
        return "";
    }

    fun autoDownCronJobB3(): String {
        if (findViewById<TextView>(R.id.B3).text != "" && findViewById<TextView>(R.id.B11).text == "") {
            val B2Char = findViewById<TextView>(R.id.B3).text
            findViewById<TextView>(R.id.B3).text = ""
            findViewById<TextView>(R.id.B11).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B11).text != "" && findViewById<TextView>(R.id.B19).text == "") {
            val B2Char = findViewById<TextView>(R.id.B11).text
            findViewById<TextView>(R.id.B11).text = ""
            findViewById<TextView>(R.id.B19).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B19).text != "" && findViewById<TextView>(R.id.B27).text == "") {
            val B2Char = findViewById<TextView>(R.id.B19).text
            findViewById<TextView>(R.id.B19).text = ""
            findViewById<TextView>(R.id.B27).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B27).text != "" && findViewById<TextView>(R.id.B35).text == "") {
            val B2Char = findViewById<TextView>(R.id.B27).text
            findViewById<TextView>(R.id.B27).text = ""
            findViewById<TextView>(R.id.B35).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B35).text != "" && findViewById<TextView>(R.id.B43).text == "") {
            val B2Char = findViewById<TextView>(R.id.B35).text
            findViewById<TextView>(R.id.B35).text = ""
            findViewById<TextView>(R.id.B43).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B43).text != "" && findViewById<TextView>(R.id.B51).text == "") {
            val B2Char = findViewById<TextView>(R.id.B43).text
            findViewById<TextView>(R.id.B43).text = ""
            findViewById<TextView>(R.id.B51).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B51).text != "" && findViewById<TextView>(R.id.B59).text == "") {
            val B2Char = findViewById<TextView>(R.id.B51).text
            findViewById<TextView>(R.id.B51).text = ""
            findViewById<TextView>(R.id.B59).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B59).text != "" && findViewById<TextView>(R.id.B67).text == "") {
            val B2Char = findViewById<TextView>(R.id.B59).text
            findViewById<TextView>(R.id.B59).text = ""
            findViewById<TextView>(R.id.B67).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B67).text != "" && findViewById<TextView>(R.id.B75).text == "") {
            val B2Char = findViewById<TextView>(R.id.B67).text
            findViewById<TextView>(R.id.B67).text = ""
            findViewById<TextView>(R.id.B75).text = B2Char
        }
        Thread.sleep(40)

        return "";
    }

    fun autoDownCronJobB4(): String {
        if (findViewById<TextView>(R.id.B4).text != "" && findViewById<TextView>(R.id.B12).text == "") {
            val B2Char = findViewById<TextView>(R.id.B4).text
            findViewById<TextView>(R.id.B4).text = ""
            findViewById<TextView>(R.id.B12).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B12).text != "" && findViewById<TextView>(R.id.B20).text == "") {
            val B2Char = findViewById<TextView>(R.id.B12).text
            findViewById<TextView>(R.id.B12).text = ""
            findViewById<TextView>(R.id.B20).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B20).text != "" && findViewById<TextView>(R.id.B28).text == "") {
            val B2Char = findViewById<TextView>(R.id.B20).text
            findViewById<TextView>(R.id.B20).text = ""
            findViewById<TextView>(R.id.B28).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B28).text != "" && findViewById<TextView>(R.id.B36).text == "") {
            val B2Char = findViewById<TextView>(R.id.B28).text
            findViewById<TextView>(R.id.B28).text = ""
            findViewById<TextView>(R.id.B36).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B36).text != "" && findViewById<TextView>(R.id.B44).text == "") {
            val B2Char = findViewById<TextView>(R.id.B36).text
            findViewById<TextView>(R.id.B36).text = ""
            findViewById<TextView>(R.id.B44).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B44).text != "" && findViewById<TextView>(R.id.B52).text == "") {
            val B2Char = findViewById<TextView>(R.id.B44).text
            findViewById<TextView>(R.id.B44).text = ""
            findViewById<TextView>(R.id.B52).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B52).text != "" && findViewById<TextView>(R.id.B60).text == "") {
            val B2Char = findViewById<TextView>(R.id.B52).text
            findViewById<TextView>(R.id.B52).text = ""
            findViewById<TextView>(R.id.B60).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B60).text != "" && findViewById<TextView>(R.id.B68).text == "") {
            val B2Char = findViewById<TextView>(R.id.B60).text
            findViewById<TextView>(R.id.B60).text = ""
            findViewById<TextView>(R.id.B68).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B68).text != "" && findViewById<TextView>(R.id.B76).text == "") {
            val B2Char = findViewById<TextView>(R.id.B68).text
            findViewById<TextView>(R.id.B68).text = ""
            findViewById<TextView>(R.id.B76).text = B2Char
        }
        Thread.sleep(40)


        return "";
    }

    fun autoDownCronJobB5(): String {
        if (findViewById<TextView>(R.id.B5).text != "" && findViewById<TextView>(R.id.B13).text == "") {
            val B2Char = findViewById<TextView>(R.id.B5).text
            findViewById<TextView>(R.id.B5).text = ""
            findViewById<TextView>(R.id.B13).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B13).text != "" && findViewById<TextView>(R.id.B21).text == "") {
            val B2Char = findViewById<TextView>(R.id.B13).text
            findViewById<TextView>(R.id.B13).text = ""
            findViewById<TextView>(R.id.B21).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B21).text != "" && findViewById<TextView>(R.id.B29).text == "") {
            val B2Char = findViewById<TextView>(R.id.B21).text
            findViewById<TextView>(R.id.B21).text = ""
            findViewById<TextView>(R.id.B29).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B29).text != "" && findViewById<TextView>(R.id.B37).text == "") {
            val B2Char = findViewById<TextView>(R.id.B29).text
            findViewById<TextView>(R.id.B29).text = ""
            findViewById<TextView>(R.id.B37).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B37).text != "" && findViewById<TextView>(R.id.B45).text == "") {
            val B2Char = findViewById<TextView>(R.id.B37).text
            findViewById<TextView>(R.id.B37).text = ""
            findViewById<TextView>(R.id.B45).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B45).text != "" && findViewById<TextView>(R.id.B53).text == "") {
            val B2Char = findViewById<TextView>(R.id.B45).text
            findViewById<TextView>(R.id.B45).text = ""
            findViewById<TextView>(R.id.B53).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B53).text != "" && findViewById<TextView>(R.id.B61).text == "") {
            val B2Char = findViewById<TextView>(R.id.B53).text
            findViewById<TextView>(R.id.B53).text = ""
            findViewById<TextView>(R.id.B61).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B61).text != "" && findViewById<TextView>(R.id.B69).text == "") {
            val B2Char = findViewById<TextView>(R.id.B61).text
            findViewById<TextView>(R.id.B61).text = ""
            findViewById<TextView>(R.id.B69).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B69).text != "" && findViewById<TextView>(R.id.B77).text == "") {
            val B2Char = findViewById<TextView>(R.id.B69).text
            findViewById<TextView>(R.id.B69).text = ""
            findViewById<TextView>(R.id.B77).text = B2Char
        }
        Thread.sleep(40)


        return "";
    }

    fun autoDownCronJobB6(): String {
        if (findViewById<TextView>(R.id.B6).text != "" && findViewById<TextView>(R.id.B14).text == "") {
            val B2Char = findViewById<TextView>(R.id.B6).text
            findViewById<TextView>(R.id.B6).text = ""
            findViewById<TextView>(R.id.B14).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B14).text != "" && findViewById<TextView>(R.id.B22).text == "") {
            val B2Char = findViewById<TextView>(R.id.B14).text
            findViewById<TextView>(R.id.B14).text = ""
            findViewById<TextView>(R.id.B22).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B22).text != "" && findViewById<TextView>(R.id.B30).text == "") {
            val B2Char = findViewById<TextView>(R.id.B22).text
            findViewById<TextView>(R.id.B22).text = ""
            findViewById<TextView>(R.id.B30).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B30).text != "" && findViewById<TextView>(R.id.B38).text == "") {
            val B2Char = findViewById<TextView>(R.id.B30).text
            findViewById<TextView>(R.id.B30).text = ""
            findViewById<TextView>(R.id.B38).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B38).text != "" && findViewById<TextView>(R.id.B46).text == "") {
            val B2Char = findViewById<TextView>(R.id.B38).text
            findViewById<TextView>(R.id.B38).text = ""
            findViewById<TextView>(R.id.B46).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B46).text != "" && findViewById<TextView>(R.id.B54).text == "") {
            val B2Char = findViewById<TextView>(R.id.B46).text
            findViewById<TextView>(R.id.B46).text = ""
            findViewById<TextView>(R.id.B54).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B54).text != "" && findViewById<TextView>(R.id.B62).text == "") {
            val B2Char = findViewById<TextView>(R.id.B54).text
            findViewById<TextView>(R.id.B54).text = ""
            findViewById<TextView>(R.id.B62).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B62).text != "" && findViewById<TextView>(R.id.B70).text == "") {
            val B2Char = findViewById<TextView>(R.id.B62).text
            findViewById<TextView>(R.id.B62).text = ""
            findViewById<TextView>(R.id.B70).text = B2Char
        }
        Thread.sleep(40)

        if (findViewById<TextView>(R.id.B70).text != "" && findViewById<TextView>(R.id.B78).text == "") {
            val B2Char = findViewById<TextView>(R.id.B70).text
            findViewById<TextView>(R.id.B70).text = ""
            findViewById<TextView>(R.id.B78).text = B2Char
        }
        Thread.sleep(40)


        return "";
    }

    fun autoDownCronJobB7(): String {
        if (findViewById<TextView>(R.id.B7).text != "" && findViewById<TextView>(R.id.B15).text == "") {
            val B7Char = findViewById<TextView>(R.id.B7).text
            findViewById<TextView>(R.id.B7).text = ""
            findViewById<TextView>(R.id.B15).text = B7Char
        }
        Thread.sleep(40)
        if(findViewById<TextView>(R.id.B15).text != "" && findViewById<TextView>(R.id.B23).text == ""){
            val B7Char = findViewById<TextView>(R.id.B15).text
            findViewById<TextView>(R.id.B15).text = ""
            findViewById<TextView>(R.id.B23).text = B7Char
        }
        Thread.sleep(40)
        if (findViewById<TextView>(R.id.B23).text != "" && findViewById<TextView>(R.id.B31).text == "") {
            val B7Char = findViewById<TextView>(R.id.B23).text
            findViewById<TextView>(R.id.B23).text = ""
            findViewById<TextView>(R.id.B31).text = B7Char
        }
        Thread.sleep(40)
        if(findViewById<TextView>(R.id.B31).text != "" && findViewById<TextView>(R.id.B39).text == ""){
            val B7Char = findViewById<TextView>(R.id.B31).text
            findViewById<TextView>(R.id.B31).text = ""
            findViewById<TextView>(R.id.B39).text = B7Char
        }
        Thread.sleep(40)
        if (findViewById<TextView>(R.id.B39).text != "" && findViewById<TextView>(R.id.B47).text == "") {
            val B7Char = findViewById<TextView>(R.id.B39).text
            findViewById<TextView>(R.id.B39).text = ""
            findViewById<TextView>(R.id.B47).text = B7Char
        }
        Thread.sleep(40)
        if(findViewById<TextView>(R.id.B47).text != "" && findViewById<TextView>(R.id.B55).text == ""){
            val B7Char = findViewById<TextView>(R.id.B47).text
            findViewById<TextView>(R.id.B47).text = ""
            findViewById<TextView>(R.id.B55).text = B7Char
        }
        Thread.sleep(40)
        if(findViewById<TextView>(R.id.B55).text != "" && findViewById<TextView>(R.id.B63).text == ""){
            val B7Char = findViewById<TextView>(R.id.B55).text
            findViewById<TextView>(R.id.B55).text = ""
            findViewById<TextView>(R.id.B63).text = B7Char
        }
        Thread.sleep(40)
        if (findViewById<TextView>(R.id.B63).text != "" && findViewById<TextView>(R.id.B71).text == "") {
            val B7Char = findViewById<TextView>(R.id.B63).text
            findViewById<TextView>(R.id.B63).text = ""
            findViewById<TextView>(R.id.B71).text = B7Char
        }
        Thread.sleep(40)
        if(findViewById<TextView>(R.id.B71).text != "" && findViewById<TextView>(R.id.B79).text == ""){
            val B7Char = findViewById<TextView>(R.id.B71).text
            findViewById<TextView>(R.id.B71).text = ""
            findViewById<TextView>(R.id.B79).text = B7Char
        }
        Thread.sleep(40)



        return "";
    }

    fun autoDownCronJobB8(): String {
        if (findViewById<TextView>(R.id.B8).text != "" && findViewById<TextView>(R.id.B16).text == "") {
            val B8Char = findViewById<TextView>(R.id.B8).text
            findViewById<TextView>(R.id.B8).text = ""
            findViewById<TextView>(R.id.B16).text = B8Char
        }
        Thread.sleep(40)
        if (findViewById<TextView>(R.id.B16).text != "" && findViewById<TextView>(R.id.B24).text == "") {
            val B8Char = findViewById<TextView>(R.id.B16).text
            findViewById<TextView>(R.id.B16).text = ""
            findViewById<TextView>(R.id.B24).text = B8Char
        }
        Thread.sleep(40)
        if (findViewById<TextView>(R.id.B24).text != "" && findViewById<TextView>(R.id.B32).text == "") {
            val B8Char = findViewById<TextView>(R.id.B24).text
            findViewById<TextView>(R.id.B24).text = ""
            findViewById<TextView>(R.id.B32).text = B8Char
        }
        Thread.sleep(40)
        if (findViewById<TextView>(R.id.B32).text != "" && findViewById<TextView>(R.id.B40).text == "") {
            val B8Char = findViewById<TextView>(R.id.B32).text
            findViewById<TextView>(R.id.B32).text = ""
            findViewById<TextView>(R.id.B40).text = B8Char
        }
        Thread.sleep(40)
        if (findViewById<TextView>(R.id.B40).text != "" && findViewById<TextView>(R.id.B48).text == "") {
            val B8Char = findViewById<TextView>(R.id.B40).text
            findViewById<TextView>(R.id.B40).text = ""
            findViewById<TextView>(R.id.B48).text = B8Char
        }
        Thread.sleep(40)
        if (findViewById<TextView>(R.id.B48).text != "" && findViewById<TextView>(R.id.B56).text == "") {
            val B8Char = findViewById<TextView>(R.id.B48).text
            findViewById<TextView>(R.id.B48).text = ""
            findViewById<TextView>(R.id.B56).text = B8Char
        }
        Thread.sleep(40)
        if (findViewById<TextView>(R.id.B56).text != "" && findViewById<TextView>(R.id.B64).text == "") {
            val B8Char = findViewById<TextView>(R.id.B56).text
            findViewById<TextView>(R.id.B56).text = ""
            findViewById<TextView>(R.id.B64).text = B8Char
        }
        Thread.sleep(40)
        if (findViewById<TextView>(R.id.B64).text != "" && findViewById<TextView>(R.id.B72).text == "") {
            val B8Char = findViewById<TextView>(R.id.B64).text
            findViewById<TextView>(R.id.B64).text = ""
            findViewById<TextView>(R.id.B72).text = B8Char
        }
        Thread.sleep(40)
        if (findViewById<TextView>(R.id.B72).text != "" && findViewById<TextView>(R.id.B80).text == "") {
            val B8Char = findViewById<TextView>(R.id.B72).text
            findViewById<TextView>(R.id.B72).text = ""
            findViewById<TextView>(R.id.B80).text = B8Char
        }
        Thread.sleep(40)


        return "";
    }


    private fun isWordCorrect(searchWord: CharSequence): Any {
        val inputStream: InputStream = assets.open("kelime_havuzu.txt")
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val inputString = bufferedReader.use { it.readText() }

        if (inputString.contains(searchWord)) {

            var scoreCounter = findViewById(R.id.scoreHolder) as TextView

            calculateWordPoint(searchWord.toString());

            scoreCounter.text = counter.toString()

            return "Metin dosyası aranan kelimeyi içeriyor. " + searchWord;
        } else {
            // sayaç 1 de kalıyor artmıyor kafam almadı çözemedim çözdüm
            sayac += 1
            println(sayac)
        }
        if(sayac == 3){
                findViewById<TextView>(R.id.B1).text = randomChar().toString();
                findViewById<TextView>(R.id.B2).text = randomChar().toString();
                findViewById<TextView>(R.id.B3).text = randomChar().toString();
                findViewById<TextView>(R.id.B4).text = randomChar().toString();
                findViewById<TextView>(R.id.B5).text = randomChar().toString();
                findViewById<TextView>(R.id.B6).text = randomChar().toString();
                findViewById<TextView>(R.id.B7).text = randomChar().toString();
                findViewById<TextView>(R.id.B8).text = randomChar().toString();
                sayac = 0
        }

        return false;
    }

    // fe'den harfler büyük geliyor textte küçük harfler var aşağıda büyük harfler var  ayarladım küçük harf girişi iptal
    private fun calculateWordPoint(searchWordChar: String) : String {

        val valueOfChars = mapOf(
            "A" to 1,
            "B" to 3,
            "C" to 4,
            "Ç" to 4,
            "D" to 3,
            "E" to 1,
            "F" to 7,
            "G" to 5,
            "Ğ" to 8,
            "H" to 5,
            "I" to 2,
            "İ" to 1,
            "J" to 10,
            "K" to 1,
            "L" to 1,
            "M" to 2,
            "N" to 1,
            "O" to 2,
            "Ö" to 7,
            "P" to 5,
            "R" to 1,
            "S" to 2,
            "Ş" to 4,
            "T" to 1,
            "U" to 2,
            "Ü" to 3,
            "V" to 7,
            "Y" to 3,
            "Z" to 4
        )
        for (char: Char in searchWordChar.toCharArray()) {
            counter += valueOfChars[char.toString()]!!
        }

        return "";
    }

    var nextUp: Int = 0
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
        val index = (0..chars.length - 1).random()
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

        val buttons = arrayOf(
            b1,
            b2,
            b3,
            b4,
            b5,
            b6,
            b7,
            b8,
            b9,
            b10,
            b11,
            b12,
            b13,
            b14,
            b15,
            b16,
            b17,
            b18,
            b19,
            b20,
            b21,
            b22,
            b23,
            b24,
            b25,
            b26,
            b27,
            b28,
            b29,
            b30,
            b31,
            b32,
            b33,
            b34,
            b35,
            b36,
            b37,
            b38,
            b39,
            b40,
            b41,
            b42,
            b43,
            b44,
            b45,
            b46,
            b47,
            b48,
            b49,
            b50,
            b51,
            b52,
            b53,
            b54,
            b55,
            b56,
            b57,
            b58,
            b59,
            b60,
            b61,
            b62,
            b63,
            b64,
            b65,
            b66,
            b67,
            b68,
            b69,
            b70,
            b71,
            b72,
            b73,
            b74,
            b75,
            b76,
            b77,
            b78,
            b79,
            b80
        )

        for (button in buttons) {
            button.setOnClickListener {
                val text = button.text.toString()
                val currentText = editText.text.toString()
                editText.setText("$currentText$text")
            }
        }
    }


    private fun next_shape() {
        findViewById<TextView>(R.id.B1).text = randomChar().toString();
        findViewById<TextView>(R.id.B2).text = randomChar().toString();
        findViewById<TextView>(R.id.B3).text = randomChar().toString();
        findViewById<TextView>(R.id.B4).text = randomChar().toString();
        findViewById<TextView>(R.id.B5).text = randomChar().toString();
        findViewById<TextView>(R.id.B6).text = randomChar().toString();
        findViewById<TextView>(R.id.B7).text = randomChar().toString();
        findViewById<TextView>(R.id.B8).text = randomChar().toString();
        findViewById<TextView>(R.id.B9).text = randomChar().toString();
        findViewById<TextView>(R.id.B10).text = randomChar().toString();
        findViewById<TextView>(R.id.B11).text = randomChar().toString();
        findViewById<TextView>(R.id.B12).text = randomChar().toString();
        findViewById<TextView>(R.id.B13).text = randomChar().toString();
        findViewById<TextView>(R.id.B14).text = randomChar().toString();
        findViewById<TextView>(R.id.B15).text = randomChar().toString();
        findViewById<TextView>(R.id.B16).text = randomChar().toString();
        findViewById<TextView>(R.id.B17).text = randomChar().toString();
        findViewById<TextView>(R.id.B18).text = randomChar().toString();
        findViewById<TextView>(R.id.B19).text = randomChar().toString();
        findViewById<TextView>(R.id.B20).text = randomChar().toString();
        findViewById<TextView>(R.id.B21).text = randomChar().toString();
        findViewById<TextView>(R.id.B22).text = randomChar().toString();
        findViewById<TextView>(R.id.B23).text = randomChar().toString();
        findViewById<TextView>(R.id.B24).text = randomChar().toString();
        findViewById<TextView>(R.id.B1).text = randomChar().toString();
        findViewById<TextView>(R.id.B2).text = randomChar().toString();
        findViewById<TextView>(R.id.B3).text = randomChar().toString();
        findViewById<TextView>(R.id.B4).text = randomChar().toString();
        findViewById<TextView>(R.id.B5).text = randomChar().toString();
        findViewById<TextView>(R.id.B6).text = randomChar().toString();
        findViewById<TextView>(R.id.B7).text = randomChar().toString();
        findViewById<TextView>(R.id.B8).text = randomChar().toString();
        findViewById<TextView>(R.id.B9).text = randomChar().toString();
        findViewById<TextView>(R.id.B10).text = randomChar().toString();
        findViewById<TextView>(R.id.B11).text = randomChar().toString();
        findViewById<TextView>(R.id.B12).text = randomChar().toString();
        findViewById<TextView>(R.id.B13).text = randomChar().toString();
        findViewById<TextView>(R.id.B14).text = randomChar().toString();
        findViewById<TextView>(R.id.B15).text = randomChar().toString();
        findViewById<TextView>(R.id.B16).text = randomChar().toString();
        findViewById<TextView>(R.id.B17).text = randomChar().toString();
        findViewById<TextView>(R.id.B18).text = randomChar().toString();
        findViewById<TextView>(R.id.B19).text = randomChar().toString();
        findViewById<TextView>(R.id.B20).text = randomChar().toString();
        findViewById<TextView>(R.id.B21).text = randomChar().toString();
        findViewById<TextView>(R.id.B22).text = randomChar().toString();
        findViewById<TextView>(R.id.B23).text = randomChar().toString();
        findViewById<TextView>(R.id.B24).text = randomChar().toString();
        findViewById<TextView>(R.id.B1).text = randomChar().toString();
        findViewById<TextView>(R.id.B2).text = randomChar().toString();
        findViewById<TextView>(R.id.B3).text = randomChar().toString();
        findViewById<TextView>(R.id.B4).text = randomChar().toString();
        findViewById<TextView>(R.id.B5).text = randomChar().toString();
        findViewById<TextView>(R.id.B6).text = randomChar().toString();
        findViewById<TextView>(R.id.B7).text = randomChar().toString();
        findViewById<TextView>(R.id.B8).text = randomChar().toString();
        findViewById<TextView>(R.id.B9).text = randomChar().toString();
        findViewById<TextView>(R.id.B10).text = randomChar().toString();
        findViewById<TextView>(R.id.B11).text = randomChar().toString();
        findViewById<TextView>(R.id.B12).text = randomChar().toString();
        findViewById<TextView>(R.id.B13).text = randomChar().toString();
        findViewById<TextView>(R.id.B14).text = randomChar().toString();
        findViewById<TextView>(R.id.B15).text = randomChar().toString();
        findViewById<TextView>(R.id.B16).text = randomChar().toString();
        findViewById<TextView>(R.id.B17).text = randomChar().toString();
        findViewById<TextView>(R.id.B18).text = randomChar().toString();
        findViewById<TextView>(R.id.B19).text = randomChar().toString();
        findViewById<TextView>(R.id.B20).text = randomChar().toString();
        findViewById<TextView>(R.id.B21).text = randomChar().toString();
        findViewById<TextView>(R.id.B22).text = randomChar().toString();
        findViewById<TextView>(R.id.B23).text = randomChar().toString();
        findViewById<TextView>(R.id.B24).text = randomChar().toString();

        //üç kez anlamsız girilince cart curt


    }


}