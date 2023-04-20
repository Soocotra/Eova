package com.app.myapp.API

import com.app.myapp.model.InterviewRequest
import com.app.myapp.model.InterviewResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface InterviewAPI {
    @POST("predicts")
    fun postResult(@Body req:InterviewRequest): Call<InterviewResponse>
}