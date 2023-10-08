package com.emirli.movies

import com.emirli.movies.presentation.home.HomeScreenViewModel
import io.ktor.client.engine.android.Android
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

actual fun platformModule() = module {

    single {
        Android.create()
    }
    /**
     *
     * for android koin has a special viewmodel scope that we can use
     * to create a viewmodel
     *
     */
    /**
     *
     * for android koin has a special viewmodel scope that we can use
     * to create a viewmodel
     *
     */

    viewModel {
        HomeScreenViewModel(get())
    }


}

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()