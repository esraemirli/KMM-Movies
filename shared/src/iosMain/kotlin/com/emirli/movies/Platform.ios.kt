package com.emirli.movies

import com.emirli.movies.presentation.home.HomeScreenViewModel
import io.ktor.client.engine.darwin.Darwin
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.dsl.module


actual fun platformModule() = module {

    single {
        Darwin.create()
    }

    //single or factory can be used to get a view-model object for swiftui

    single {
        HomeScreenViewModel(get())
    }
}


object ViewModels : KoinComponent {
    fun getHomeViewModel() = get<HomeScreenViewModel>()

}