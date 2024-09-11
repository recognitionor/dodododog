package com.ham.dodododog.di

import com.ham.dodododog.main.domain.MainDataSource


expect class AppModule {
    val dbMainDataSource: MainDataSource
}