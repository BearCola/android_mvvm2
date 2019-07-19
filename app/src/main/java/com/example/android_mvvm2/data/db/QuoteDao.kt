package com.example.android_mvvm2.data.db

import androidx.lifecycle.LiveData
import com.example.android_mvvm2.data.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}