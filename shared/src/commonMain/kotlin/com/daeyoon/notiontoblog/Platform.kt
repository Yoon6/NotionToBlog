package com.daeyoon.notiontoblog

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform