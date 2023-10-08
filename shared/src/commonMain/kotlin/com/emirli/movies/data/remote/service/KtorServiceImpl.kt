package com.emirli.movies.data.remote.service

import com.emirli.movies.data.remote.model.MovieListResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class KtorServiceImpl(
    private val httpClient: HttpClient
) : KtorService {

    private val baseUrl = "https://api.themoviedb.org/3"
    private val apiKey = "55368e778ff6a07240912cea58f157a7"

    override suspend fun getMovies(): MovieListResponse = httpClient.get(
        "$baseUrl/discover/movie"
    ) {
        parameter("api_key",apiKey)
    }.body()
}