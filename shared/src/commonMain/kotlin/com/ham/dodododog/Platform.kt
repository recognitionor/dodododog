package com.ham.dodododog

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform