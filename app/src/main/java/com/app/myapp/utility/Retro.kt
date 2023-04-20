package com.app.myapp.utility

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retro {
    fun getRetroClientInstance(): Retrofit {
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder().
        baseUrl("http://129.150.57.39:5000/").
        addConverterFactory(GsonConverterFactory.create(gson)).
        build()
    }

}