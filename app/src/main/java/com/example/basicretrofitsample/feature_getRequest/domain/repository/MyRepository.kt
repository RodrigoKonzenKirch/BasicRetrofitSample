package com.example.basicretrofitsample.feature_getRequest.domain.repository

import com.example.basicretrofitsample.feature_getRequest.domain.models.Quotes

interface MyRepository {
    suspend fun getQuotes(): Quotes?
}