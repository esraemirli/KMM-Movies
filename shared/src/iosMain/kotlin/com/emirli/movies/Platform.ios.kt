package com.emirli.movies

import org.koin.dsl.module
import platform.UIKit.UIDevice


actual fun platformModule() = module {
    single {
        //Darwin.create()
    }

    //single or factory can be used to get a view-model object for swiftui

    single {
        //HomeScreenViewModel(get())
    }
    factory {
       // NewsDetailsViewModel(get())
    }
    factory {
       // ReadLaterViewModel(get())
    }
}


class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()