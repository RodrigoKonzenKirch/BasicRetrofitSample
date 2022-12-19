package com.example.basicretrofitsample.feature_getRequest.presentation.get_quotes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.basicretrofitsample.feature_getRequest.domain.models.Quote

@Composable
fun QuoteComposable(quote: Quote){
    Surface(modifier = Modifier.fillMaxWidth(), elevation = 8.dp ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Author: ${quote.author}",
                textAlign = TextAlign.Center
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "ID: ${quote.id}",
                textAlign = TextAlign.Center
            )
            Text(
                modifier = Modifier.padding(vertical = 8.dp),
                text = "Quote:"
            )
            Text(
                text = "\"${quote.quote}\""
            )
        }
    }
}