package com.example.basicretrofitsample.feature_getRequest.data.repository

import com.example.basicretrofitsample.feature_getRequest.data.data_source.MyApi
import com.example.basicretrofitsample.feature_getRequest.domain.models.Quotes
import com.example.basicretrofitsample.feature_getRequest.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi
): MyRepository {

    override suspend fun getQuotes(): Quotes? {
        return api.getQuotes()
    }

}