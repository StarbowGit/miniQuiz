package com.starbow.quiz4_2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.starbow.quiz4_2_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { radioGroup, checkedId ->
            when(checkedId) {
                R.id.Apple -> binding.textView.text = "사과"//직접입력
                R.id.Banana -> binding.textView.text = "바나나"
                R.id.Orange -> binding.textView.text = "${binding.Orange.text}"
                //해당 라디오버튼의 text속성을 가져오는 방식으로 구현
            }
        }
    }
}