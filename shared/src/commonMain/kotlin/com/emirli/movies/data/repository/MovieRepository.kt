package com.emirli.movies.data.repository

import com.emirli.movies.data.remote.model.MovieListResponse

interface MovieRepository {
    suspend fun getMovies(): MovieListResponse
}