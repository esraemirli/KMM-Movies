package com.emirli.movies.android.util.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.emirli.movies.android.home.HomeScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination =  Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
           // HomeScreen(navController)
        }
    }
}