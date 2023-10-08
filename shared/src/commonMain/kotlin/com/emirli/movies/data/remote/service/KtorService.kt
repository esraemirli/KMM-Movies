package com.emirli.movies.data.remote.service

import com.emirli.movies.data.remote.model.MovieListResponse

interface KtorService {
    suspend fun getMovies(): MovieListResponse
}