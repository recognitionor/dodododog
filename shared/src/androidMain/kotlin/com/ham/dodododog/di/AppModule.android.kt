package com.ham.dodododog.di

import android.content.Context
import com.ham.dodododog.AppDatabase
import com.ham.dodododog.core.data.DatabaseDriverFactory
import com.ham.dodododog.core.data.KtorClientFactory
import com.ham.dodododog.main.data.MainDataSourceImpl
import com.ham.dodododog.main.domain.MainDataSource
import com.ham.dodododog.typping_info.data.TypingInfoSourceImpl
import com.ham.dodododog.typping_info.domain.TypingInfoSource

actual class AppModule(private val context: Context) {
    actual val dbMainDataSource: MainDataSource by lazy {
        MainDataSourceImpl(
            db = AppDatabase(
                driver = DatabaseDriverFactory(context).create(),
            ), KtorClientFactory.build()
        )
    }
    actual val typingInfoSource: TypingInfoSource by lazy {
        TypingInfoSourceImpl(KtorClientFactory.build())
    }

}