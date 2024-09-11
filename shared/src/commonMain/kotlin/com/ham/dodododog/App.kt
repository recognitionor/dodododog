package com.ham.dodododog

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.ham.dodododog.di.AppModule
import com.ham.dodododog.main.presentation.MainScreen
import com.jhlee.kmm_rongame.ui.theme.LightColorScheme

var backKeyListener: (() -> Unit?)? = null

@Composable
fun App(appModule: AppModule) {
    MaterialTheme(colorScheme = LightColorScheme) {
        MainScreen(appModule)
    }
}