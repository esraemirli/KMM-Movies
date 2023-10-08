package com.emirli.movies

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform