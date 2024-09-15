package com.ham.dodododog.typping_info.data

import com.ham.dodododog.core.domain.Resource
import com.ham.dodododog.typping_info.data.Test
import com.ham.dodododog.typping_info.domain.TypingInfoSource
import com.jhlee.kmm_rongame.core.util.Logger
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.ContentType.Application.Json
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.serialization.json.Json

class TypingInfoSourceImpl(val httpClient: HttpClient) : TypingInfoSource {
    override fun getTypingInfoList(): Flow<Resource<List<Test>>> {
        return flow {
            Logger.log("getTypingInfoList")
            try {
                val list: Test =
                    httpClient.get("https://api.onettsix.com/list/typing-game").body<Test>()
                Logger.log("list : $list")
//            emit(Resource.Success(list))
            } catch (e: Exception) {
                emit(Resource.Error(e.message.toString()))
            }
        }
    }
}