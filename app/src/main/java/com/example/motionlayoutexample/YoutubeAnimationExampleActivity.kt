package com.example.motionlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class YoutubeAnimationExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube_animation_example)

        supportActionBar?.title = "YT MotionExample"
    }
}