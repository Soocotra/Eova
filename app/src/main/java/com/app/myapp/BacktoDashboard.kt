package com.app.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BacktoDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backto_dashboard)
    }
    fun gotodashboard (view: View) {
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)
    }
}