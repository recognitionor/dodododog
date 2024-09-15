package com.ham.dodododog.typping_info.domain

import com.ham.dodododog.core.domain.Resource
import com.ham.dodododog.typping_info.data.Test
import kotlinx.coroutines.flow.Flow

interface TypingInfoSource {
    fun getTypingInfoList(): Flow<Resource<List<Test>>>
}