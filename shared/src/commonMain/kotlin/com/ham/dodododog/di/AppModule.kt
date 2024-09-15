package com.ham.dodododog.di

import com.ham.dodododog.main.domain.MainDataSource
import com.ham.dodododog.typping_info.domain.TypingInfoSource


expect class AppModule {
    val dbMainDataSource: MainDataSource
    val typingInfoSource: TypingInfoSource
}