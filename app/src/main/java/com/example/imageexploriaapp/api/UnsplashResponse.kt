package com.example.imageexploriaapp.api

import com.example.imageexploriaapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)