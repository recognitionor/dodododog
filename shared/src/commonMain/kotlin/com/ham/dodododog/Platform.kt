package com.ham.dodododog

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig

interface Platform {
    val name: String
    val version: String
}

expect fun getPlatform(): Platform

expect fun httpClient(config: HttpClientConfig<*>.() -> Unit): HttpClient

expect fun initLogger()

expect fun showToast(message: String)

expect fun isAndroid(): Boolean

