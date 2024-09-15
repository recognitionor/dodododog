package com.ham.dodododog.main.presentation

import androidx.compose.runtime.Composable

data class MainState(
    val openDialog: Int = 0,
    val dialog: (@Composable () -> Unit)? = null,
    val isWholeScreenOpen: Boolean = false,
    val selectedTab: Int = 0,
    val isLoading: Boolean = true,
    val progress: String = "",
    val error: String = "",
) {
    companion object {
        const val NAVIGATION_TAB_HOME = 0
        const val NAVIGATION_TAB_GAME = 1
        const val NAVIGATION_TAB_BOOK = 2
        const val NAVIGATION_TAB_REWARD = 3
    }
}