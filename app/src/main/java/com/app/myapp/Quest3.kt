package com.app.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class Quest3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest3)

        val answerVal = intent.extras?.getString("answer_val")
        val buttonYes = findViewById<Button>(R.id.button6)
        val buttonNo = findViewById<Button>(R.id.button7)

        intent = Intent(applicationContext, Quest4::class.java)
        buttonYes.setOnClickListener {
            intent.putExtra("answer_val", answerVal + "1")
            startActivity(intent)
        }
        buttonNo.setOnClickListener {
            intent.putExtra("answer_val", answerVal + "0")
            startActivity(intent)
        }
    }
}