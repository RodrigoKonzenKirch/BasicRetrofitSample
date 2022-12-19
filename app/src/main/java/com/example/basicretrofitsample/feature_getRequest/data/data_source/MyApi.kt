package com.example.basicretrofitsample.feature_getRequest.data.data_source

import com.example.basicretrofitsample.feature_getRequest.domain.models.Quotes
import retrofit2.http.GET

interface MyApi {
    @GET("/quotes")
    suspend fun getQuotes(): Quotes?
}