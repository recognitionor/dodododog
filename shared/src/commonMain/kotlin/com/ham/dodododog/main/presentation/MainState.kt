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


    }
}