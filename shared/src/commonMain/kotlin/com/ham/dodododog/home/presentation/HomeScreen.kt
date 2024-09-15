package com.ham.dodododog.home.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ham.dodododog.di.AppModule
import com.ham.dodododog.main.presentation.MainViewModel
import com.ham.dodododog.typping_info.presentation.TypingInfoListScreen

@Composable
fun HomeScreen(viewModel: MainViewModel, appModule: AppModule) {

    Box {
        TypingInfoListScreen(appModule)
    }

}