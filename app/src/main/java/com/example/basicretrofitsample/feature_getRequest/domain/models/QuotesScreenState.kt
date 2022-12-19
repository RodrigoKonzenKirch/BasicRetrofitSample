package com.example.basicretrofitsample.feature_getRequest.domain.models

data class QuotesScreenState(
    val myQuotes: List<Quote> = listOf(Quote("", 0, ""))
)
