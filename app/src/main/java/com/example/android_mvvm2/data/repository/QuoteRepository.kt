package com.example.android_mvvm2.data.repository

import androidx.lifecycle.LiveData
import com.example.android_mvvm2.data.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}