package com.example.android_mvvm2.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.android_mvvm2.data.model.Quote
import com.example.android_mvvm2.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuotes() = quoteRepository.getQuotes()
}