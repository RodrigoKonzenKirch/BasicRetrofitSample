package com.example.basicretrofitsample.feature_getRequest.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.basicretrofitsample.feature_getRequest.presentation.get_quotes.QuotesScreen
import com.example.basicretrofitsample.feature_getRequest.presentation.get_quotes.QuotesScreenViewModel
import com.example.basicretrofitsample.ui.theme.BasicRetrofitSampleTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicRetrofitSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    QuotesScreen()
                }
            }
        }
    }
}

