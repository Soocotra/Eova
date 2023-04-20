package com.app.myapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class InterviewResponse {
    @SerializedName("predict")
    @Expose
    var predict: Int? = null
}