package com.app.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }
    fun gotoquest1 (view: View) {
        intent = Intent(applicationContext, Quest1::class.java)
        startActivity(intent)
    }
    fun gotoriwayat (view: View) {
        intent = Intent(applicationContext, RiwayatActivity::class.java)
        startActivity(intent)
    }
    fun gotors (view: View) {
        intent = Intent(applicationContext, RumahsakitActivity::class.java)
        startActivity(intent)
    }
//    fun gotodashboard (view: View){
//        intent = Intent(applicationContext, DashboardActivity::class.java)
//        startActivity(intent)
//    }
}