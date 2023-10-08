package com.emirli.movies

import org.koin.core.module.Module

expect fun platformModule(): Module

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform