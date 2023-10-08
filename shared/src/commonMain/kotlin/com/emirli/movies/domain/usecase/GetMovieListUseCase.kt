package com.emirli.movies.domain.usecase

import com.emirli.movies.data.remote.model.asDomainModel
import com.emirli.movies.data.repository.MovieRepository
import kotlinx.coroutines.flow.flow

class GetMovieListUseCase(
    private val repository: MovieRepository
) {
    operator fun invoke() = flow {
        val response = repository.getMovies().asDomainModel()

        emit(response)
    }
}