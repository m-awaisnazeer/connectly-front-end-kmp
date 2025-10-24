package com.plcoding.chirp.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform