package com.ham.dodododog.typping_info.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ham.dodododog.di.AppModule
import com.jhlee.kmm_rongame.core.util.Logger
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun TypingInfoListScreen(appModule: AppModule) {
    Logger.log("test")
    val typingInfoListViewModel = getViewModel(key = TypingInfoListViewModel.VIEWMODEL_KEY,
        factory = viewModelFactory { TypingInfoListViewModel(appModule.typingInfoSource) })

    Box {
        Text("여기는 타이핑 영역")
    }
}