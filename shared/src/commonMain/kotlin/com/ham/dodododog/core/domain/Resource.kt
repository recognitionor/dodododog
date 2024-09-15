package com.ham.dodododog.core.domain

sealed class Resource<T>(
    val data: T? = null,
    val description: String? = null,
    val resultCode: Int? = 0,
    val transactionTime: String? = null,
    val pagination: Pagination? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}
