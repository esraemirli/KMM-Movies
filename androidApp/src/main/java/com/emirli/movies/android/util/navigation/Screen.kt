package com.emirli.movies.android.util.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
}