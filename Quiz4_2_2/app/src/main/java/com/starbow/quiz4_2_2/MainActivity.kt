package com.starbow.quiz4_2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.starbow.quiz4_2_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    var checked = booleanArrayOf(false, false, false)//체크박스의 체크여부 확인 (0:사과, 1:바나나, 2:오렌지)
    val listener by lazy {
        CompoundButton.OnCheckedChangeListener { compoundButton, isChecked ->
            var resultString: String? = null//출력 멘트

            when(compoundButton.id) {
                R.id.Apple -> checked[0] = isChecked
                R.id.Banana -> checked[1] = isChecked
                R.id.Orange -> checked[2] = isChecked
            }//체크 여부 수정

            for (i in 0..2) {
                if(checked[i] == true) {
                    if(resultString == null) {
                        when(i) {
                            0 -> resultString = "사과"
                            1 -> resultString = "바나나"
                            2 -> resultString = "오렌지"
                        }
                    } else {
                        when(i) {
                            1 -> resultString += "와 바나나"
                            2 -> resultString += "와 오렌지"
                        }//i == 0일 때 resultString은 무조건 null을 가지므로 제외
                    }
                }
            }

            if(resultString == null) {
                Log.d("checkBox", "체크되있는것이 없습니다.")
            } else {
                Log.d("checkBox", "${resultString}가 체크되었습니다.")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.Apple.setOnCheckedChangeListener(listener)
        binding.Banana.setOnCheckedChangeListener(listener)
        binding.Orange.setOnCheckedChangeListener(listener)
    }
}