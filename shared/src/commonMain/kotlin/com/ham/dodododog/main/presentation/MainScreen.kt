package com.ham.dodododog.main.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ham.dodododog.backKeyListener
import com.ham.dodododog.di.AppModule
import com.ham.dodododog.home.presentation.HomeScreen
import com.ham.dodododog.isAndroid
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun MainScreen(appModule: AppModule) {
    val viewModel = getViewModel(key = MainViewModel.VIEWMODEL_KEY,
        factory = viewModelFactory { MainViewModel(appModule.dbMainDataSource) })
    val state: MainState by viewModel.state.collectAsState()

    LaunchedEffect(Unit) {
        backKeyListener = {

        }
    }

    DisposableEffect(Unit) {
        onDispose { }
    }
    val isTestMode = false
    val navigationBarHeight = if (isAndroid()) 80.dp else 120.dp
    Scaffold(bottomBar = {
        NavigationBar(modifier = Modifier.height(navigationBarHeight)) {
            MainScreenItem.SCREEN_LIST.forEachIndexed { index, item ->
                NavigationBarItem(icon = {
                    Icon(
                        item.icon, contentDescription = item.name
                    )
                },
                    label = { Text(item.name) },
                    selected = state.selectedTab == index,
                    onClick = { viewModel.selectedTab(index) })
            }
        }
    }) {

        Box(
            modifier = Modifier.padding(
                bottom = if (state.isWholeScreenOpen) 0.dp else navigationBarHeight,
                top = if (isAndroid()) 0.dp else 30.dp
            )
        ) {
            when (state.selectedTab) {
                MainState.NAVIGATION_TAB_HOME -> HomeScreen(viewModel, appModule)
                MainState.NAVIGATION_TAB_BOOK -> HomeScreen(viewModel, appModule)
                MainState.NAVIGATION_TAB_REWARD -> HomeScreen(viewModel, appModule)
                MainState.NAVIGATION_TAB_GAME -> HomeScreen(viewModel, appModule)
            }
        }
    }
}