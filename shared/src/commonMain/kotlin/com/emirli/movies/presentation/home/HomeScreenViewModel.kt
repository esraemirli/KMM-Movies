package com.emirli.movies.presentation.home

import com.emirli.movies.domain.usecase.GetMovieListUseCase
import com.emirli.movies.util.Result
import com.emirli.movies.util.asResult
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeScreenViewModel(
    private val getMovieListUseCase: GetMovieListUseCase
) : ViewModel() {

    private val _state = MutableStateFlow<HomeScreenState>(HomeScreenState.Idle)
    var state = _state.asStateFlow()

    fun getMovies() {
        viewModelScope.launch {
            getMovieListUseCase.invoke().asResult().collectLatest { result ->
                when (result) {
                    is Result.Error -> {
                        _state.update {
                            HomeScreenState.Error(result.message)
                        }
                    }

                    is Result.Idle -> {
                        _state.update {
                            HomeScreenState.Idle
                        }
                    }

                    Result.Loading -> {
                        _state.update {
                            HomeScreenState.Loading
                        }
                    }

                    is Result.Success -> {
                        _state.update {
                            HomeScreenState.Success(result.data)
                        }
                    }
                }
            }
        }
    }
}