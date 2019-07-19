package com.example.android_mvvm2.data.repository

import androidx.lifecycle.LiveData
import com.example.android_mvvm2.data.db.QuoteDao
import com.example.android_mvvm2.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao)
    : QuoteRepository {
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes() = quoteDao.getQuotes()
}