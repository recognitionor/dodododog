package com.ham.dodododog.main.presentation

import com.ham.dodododog.main.domain.MainDataSource
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

class MainViewModel(private val mainDataSource: MainDataSource) : ViewModel() {
    companion object {
        const val VIEWMODEL_KEY = "main_view_model"
    }

    private val _state = MutableStateFlow(MainState())

    val state = _state.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), _state.value)

    init {
    }

    fun selectedTab(selectedTab: Int) {
        _state.update {
            it.copy(selectedTab = selectedTab)
        }
    }
}