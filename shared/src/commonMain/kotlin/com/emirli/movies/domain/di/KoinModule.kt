package com.emirli.movies.domain.di

import com.emirli.movies.data.remote.service.KtorService
import com.emirli.movies.data.remote.service.KtorServiceImpl
import com.emirli.movies.data.repository.MovieRepository
import com.emirli.movies.data.repository.MovieRepositoryImpl
import com.emirli.movies.domain.usecase.GetMovieListUseCase
import com.emirli.movies.platformModule
import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(
    enableNetworkLogs: Boolean = false,
    appDeclaration: KoinAppDeclaration = {}
) = startKoin {
    appDeclaration()
    modules(commonModule(enableNetworkLogs = enableNetworkLogs))
}

fun commonModule(enableNetworkLogs: Boolean) =
    getUseCaseModule() + getDateModule(
        enableNetworkLogs,
    ) + platformModule()


fun getDateModule(enableNetworkLogs: Boolean) = module {

    single<MovieRepository> {
        MovieRepositoryImpl(
            get()
        )
    }

    single<KtorService> {
        KtorServiceImpl(get())
    }

    single { createJson() }

    single {
        createHttpClient(
            get(),
            get(),
            enableNetworkLogs = enableNetworkLogs
        )
    }


}

fun getUseCaseModule() = module {
    single {
        GetMovieListUseCase(get())
    }
}

fun createHttpClient(
    httpClientEngine: HttpClientEngine,
    json: Json,
    enableNetworkLogs: Boolean
) =
    HttpClient(httpClientEngine) {

        install(ContentNegotiation) {
            json(json)
        }
        if (enableNetworkLogs) {
            install(Logging) {
                logger = Logger.SIMPLE
                level = LogLevel.ALL
            }
        }
    }

fun createJson() = Json { isLenient = true; ignoreUnknownKeys = true }