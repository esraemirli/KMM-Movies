package com.emirli.movies.android.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.emirli.movies.domain.model.MovieUiModel
import com.emirli.movies.presentation.home.HomeScreenState
import com.emirli.movies.presentation.home.HomeScreenViewModel
import org.koin.androidx.compose.getViewModel


@Composable
fun HomeScreen(
 //   navController: NavController,
    viewModel: HomeScreenViewModel = getViewModel()
) {

    LaunchedEffect(key1 = Unit) {
        viewModel.getMovies()
    }
    val state by viewModel.state.collectAsState()

    when (state) {
        is HomeScreenState.Loading -> Text(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow), text = "Loading"
        )

        is HomeScreenState.Error -> {
            Text(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red),
                text = (state as HomeScreenState.Error).errorMessage
            )
        }

        is HomeScreenState.Success -> {
            Content(
                (state as HomeScreenState.Success).movieList
            )
        }

        else -> {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            )
        }

    }
}

@Composable
fun Content(
    movieList: List<MovieUiModel>
) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(movieList) {
            Text(
                text = it.title, modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            )
        }
    }
}