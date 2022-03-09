package com.starbow.quiz4_2_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.starbow.quiz4_2_3.databinding.ActivityMainBinding
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    var sec = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //1000ms(1초)마다 실행 ※timer는 백그라운드 스레드에서 동작하므로 주의
        kotlin.concurrent.timer(period = 1000) {
            sec++
            runOnUiThread { //메인 스레드
                binding.textView.text = "${sec}"
            }
        }
    }
}