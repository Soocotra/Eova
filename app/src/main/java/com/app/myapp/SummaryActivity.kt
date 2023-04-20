package com.app.myapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ListView
import android.widget.ProgressBar
import com.app.myapp.API.InterviewAPI
import com.app.myapp.model.InterviewRequest
import com.app.myapp.model.InterviewResponse
import com.app.myapp.utility.Retro
import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException
import kotlin.collections.ArrayList


class SummaryActivity : AppCompatActivity() {
    private lateinit var goto: Button
    val client = OkHttpClient()
    private lateinit var hasil: ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)
        goto = findViewById<Button>(R.id.go_to)
        goto.setOnClickListener {
            predict(hasil)
        }
        val answerVal = intent.extras?.getString("answer_val")
        hasil = ArrayList(answerVal?.map{it.toString().toInt()}!!)

        Log.d("hasilnya", answerVal.toString())
    }

    fun gotors(predictResult: Int) {
        intent = Intent(this, PredictionActivity::class.java);
        intent.putExtra("predict", predictResult)
        startActivity(intent);
    }

    fun predict(hasil: ArrayList<Int>){
        var interviewRequest = InterviewRequest()
        interviewRequest.input = hasil
        val retro = Retro().getRetroClientInstance().create(InterviewAPI::class.java)
        retro.postResult(interviewRequest).enqueue(object : Callback<InterviewResponse> {
            override fun onResponse(
                call: Call<InterviewResponse>,
                response: Response<InterviewResponse>
            ) {
                val predict = response.body()
                gotors(predict?.predict!!)
            }

            override fun onFailure(call: Call<InterviewResponse>, t: Throwable) {
                Log.e("Failed!!", t.message.toString())
            }
        })
    }
}