package com.ham.dodododog.typping_info.presentation

import com.ham.dodododog.core.domain.Resource
import com.ham.dodododog.typping_info.domain.TypingInfoSource
import com.jhlee.kmm_rongame.core.util.Logger
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class TypingInfoListViewModel(val typingInfoSource: TypingInfoSource) : ViewModel() {
    companion object {
        const val VIEWMODEL_KEY = "TypingInfoListViewModel"
    }

    init {
        getTypingInfoList()
    }

    private fun getTypingInfoList() {
        typingInfoSource.getTypingInfoList().onEach { result ->
            when (result) {
                is Resource.Error -> {
                    Logger.log("error : ${result.description}")
                }

                is Resource.Success -> {
                    Logger.log("Success : ${result.data}")
                }

                is Resource.Loading -> {

                }

            }
        }.launchIn(viewModelScope)
    }

}