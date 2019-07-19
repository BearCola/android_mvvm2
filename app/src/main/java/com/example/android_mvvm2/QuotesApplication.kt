package com.example.android_mvvm2

import android.app.Application
import com.example.android_mvvm2.data.db.Database
import com.example.android_mvvm2.data.db.DatabaseFakeImpl
import com.example.android_mvvm2.data.db.QuoteDao
import com.example.android_mvvm2.data.db.QuoteDaoFakeImpl
import com.example.android_mvvm2.data.repository.QuoteRepository
import com.example.android_mvvm2.data.repository.QuoteRepositoryImpl
import com.example.android_mvvm2.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuotesApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        bind() from provider { QuotesViewModelFactory(instance())}
    }

}