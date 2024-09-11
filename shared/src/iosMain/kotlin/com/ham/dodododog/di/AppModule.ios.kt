package com.ham.dodododog.di

import com.ham.dodododog.AppDatabase
import com.ham.dodododog.core.data.DatabaseDriverFactory
import com.ham.dodododog.core.data.KtorClientFactory
import com.ham.dodododog.main.data.MainDataSourceImpl
import com.ham.dodododog.main.domain.MainDataSource

actual class AppModule {
    actual val dbMainDataSource: MainDataSource by lazy {
        MainDataSourceImpl(
            db = AppDatabase(
                driver = DatabaseDriverFactory().create()
            ), KtorClientFactory.build()
        )
    }
}