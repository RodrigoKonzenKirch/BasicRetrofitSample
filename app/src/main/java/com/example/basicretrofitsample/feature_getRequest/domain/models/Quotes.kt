package com.example.basicretrofitsample.feature_getRequest.domain.models

data class Quotes(
    val limit: Int,
    val quotes: List<Quote>,
    val skip: Int,
    val total: Int
)