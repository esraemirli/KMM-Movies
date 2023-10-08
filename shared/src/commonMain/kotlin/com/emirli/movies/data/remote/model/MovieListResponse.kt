package com.emirli.movies.data.remote.model

import com.emirli.movies.domain.model.MovieUiModel

data class MovieListResponse(
    val page: Int,
    val results: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)

fun MovieListResponse.asDomainModel(): List<MovieUiModel> {
    return this.results.map {
        MovieUiModel(
            title = it.title
        )
    }
}