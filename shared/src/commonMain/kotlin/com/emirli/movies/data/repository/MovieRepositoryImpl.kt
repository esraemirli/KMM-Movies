package com.emirli.movies.data.repository

import com.emirli.movies.data.remote.model.MovieListResponse
import com.emirli.movies.data.remote.service.KtorService

class MovieRepositoryImpl(
    private val service: KtorService
) : MovieRepository {

    override suspend fun getMovies(): MovieListResponse {
        return service.getMovies()
    }
}