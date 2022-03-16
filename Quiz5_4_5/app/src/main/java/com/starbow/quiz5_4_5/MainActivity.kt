package com.starbow.quiz5_4_5

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.starbow.quiz5_4_5.databinding.ActivityMainBinding
import kotlin.math.PI

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val customView = CustomView(this)
        binding.constraintLayout.addView(customView)
    }
}

class CustomView(context: Context): View(context) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val red = Paint()
        red.color = Color.RED
        canvas?.drawCircle(100f, 100f, 80f, red)

        val white = Paint()
        white.color = Color.WHITE
        canvas?.drawCircle(100f, 100f, 60f, white)
    }
}