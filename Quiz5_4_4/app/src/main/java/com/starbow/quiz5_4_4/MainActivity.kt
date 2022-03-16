package com.starbow.quiz5_4_4

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.starbow.quiz5_4_4.databinding.ActivityMainBinding

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

        val rect = RectF(50f, 50f, 250f, 250f)

        val red = Paint()
        red.color = Color.RED
        red.style = Paint.Style.STROKE
        red.strokeWidth = 7f
        canvas?.drawRoundRect(rect, 30f, 30f, red)

        val blue = Paint()
        blue.color = Color.BLUE
        blue.style = Paint.Style.FILL
        canvas?.drawRoundRect(rect, 30f, 30f, blue)
    }
}