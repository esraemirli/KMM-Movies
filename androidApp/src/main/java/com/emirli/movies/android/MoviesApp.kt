package com.emirli.movies.android

import android.app.Application
import com.emirli.movies.domain.di.initKoin
import com.ramcosta.composedestinations.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

class MoviesApp: Application(){

    override fun onCreate() {
        super.onCreate()

        initKoin(enableNetworkLogs = BuildConfig.DEBUG) {
            androidContext(this@MoviesApp)
            // androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.INFO)
            modules(
                listOf(/**
                     * android specific modules
                     */
                module {
                    /**
                     * android specific modules
                     */
                })
            )
        }
    }
}