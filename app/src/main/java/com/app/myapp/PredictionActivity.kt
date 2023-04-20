package com.app.myapp

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.app.myapp.API.InterviewAPI
import com.app.myapp.databinding.ActivityPredictionBinding
import com.app.myapp.model.InterviewRequest
import com.app.myapp.model.InterviewResponse
import com.app.myapp.utility.Retro
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class PredictionActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityPredictionBinding
    private var prediction: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPredictionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prediction = intent.getIntExtra("predict", 0)

        defPrediction(prediction)

    }

    private fun defPrediction(prediction: Int){
        if (prediction == 3){
            binding.predictionValue.text = binding.predictionValue.text.toString() + "\nGANAS"
        }
        if (prediction == 2){
            binding.predictionValue.text =binding.predictionValue.text.toString() + "\nJINAK"
        }
    }

}