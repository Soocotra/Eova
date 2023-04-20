package com.app.myapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class InterviewRequest {
    @SerializedName("input")
    @Expose
    var input: List<Int>? = null
}