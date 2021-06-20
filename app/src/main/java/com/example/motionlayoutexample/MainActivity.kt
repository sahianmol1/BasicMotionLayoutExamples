package com.example.motionlayoutexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnBasicExample:Button
    private lateinit var btnTwitterSplashScreen: Button
    private lateinit var btnMotionHeader:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBasicExample = findViewById(R.id.btn_first_animation)
        btnTwitterSplashScreen = findViewById(R.id.btn_twitter_splash_screen)
        btnMotionHeader = findViewById(R.id.btn_motion_header)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        btnBasicExample.setOnClickListener {
            startActivity(Intent(this, FirstAnimationActivity::class.java))
        }

        btnTwitterSplashScreen.setOnClickListener {
            startActivity(Intent(this, TwitterSplashActivity::class.java))
        }

        btnMotionHeader.setOnClickListener {
            startActivity(Intent(this, MotionHeaderWithText::class.java))
        }
    }
}