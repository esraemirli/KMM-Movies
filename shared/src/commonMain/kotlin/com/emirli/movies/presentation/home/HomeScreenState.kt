package com.emirli.movies.presentation.home

import com.emirli.movies.domain.model.MovieUiModel

sealed interface HomeScreenState {
    object Loading : HomeScreenState

    object Idle : HomeScreenState

    data class Success(val movieList: List<MovieUiModel>) : HomeScreenState

    data class Error(val errorMessage: String) : HomeScreenState
}