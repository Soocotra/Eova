package com.app.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.myapp.databinding.ActivityQuest11Binding

class Quest11 : AppCompatActivity() {
    private lateinit var binding: ActivityQuest11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuest11Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val answerVal = intent.extras?.getString("answer_val")

        intent = Intent(applicationContext, SummaryActivity::class.java)
        binding.yesButton.setOnClickListener {
            intent.putExtra("answer_val", answerVal + "1")
            startActivity(intent)
        }
        binding.noButton.setOnClickListener {
            intent.putExtra("answer_val", answerVal + "0")
            startActivity(intent)
        }
    }
}