package com.example.basicretrofitsample.feature_getRequest.presentation.get_quotes

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.basicretrofitsample.feature_getRequest.domain.models.Quote
import com.example.basicretrofitsample.feature_getRequest.domain.models.Quotes
import com.example.basicretrofitsample.feature_getRequest.domain.models.QuotesScreenState
import com.example.basicretrofitsample.feature_getRequest.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuotesScreenViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {

    private val _state = mutableStateOf(QuotesScreenState())
    val state: State<QuotesScreenState> = _state

    fun getQuotes() {
        viewModelScope.launch {
            var response: Quotes? = null

            try {
                response = repository.getQuotes()
            } catch (e: Exception) {
                Log.i("MyTag", e.toString())
            }
            if (response != null)
                _state.value = state.value.copy(myQuotes = response.quotes.toList())
            else
                _state.value = state.value.copy(myQuotes = listOf(Quote("", 0, "")))
        }
    }
}