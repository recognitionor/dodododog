package com.ham.dodododog.core.domain

import kotlinx.serialization.Serializable

@Serializable
data class Pagination(
    val currentPage: Int = 0,
    val currentElements: Int = 0,
    val totalElements: Int = 0,
    val totalPages: Int = 0
)