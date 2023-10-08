

object Accompanist {
    private const val version = "0.26.2-beta"
    const val coil = "io.coil-kt:coil-compose:2.1.0"
    private const val systemUIControllerVersion = "0.24.3-alpha"
    const val systemUIController =
        "com.google.accompanist:accompanist-systemuicontroller:$systemUIControllerVersion"
    private const val accompanistPagerVersion = "0.24.3-alpha"
    const val pager = "com.google.accompanist:accompanist-pager:$accompanistPagerVersion"
    const val pagerIndicator = "com.google.accompanist:accompanist-pager-indicators:$accompanistPagerVersion"
    const val webview =  "com.google.accompanist:accompanist-webview:$version"

}

object Compose {

    const val compose_version = "1.3.1"
    const val compose_ui_version = "1.3.0-beta02"
    const val composeUI = "androidx.compose.ui:ui:$compose_ui_version"
    const val composeMaterial = "androidx.compose.material:material:$compose_ui_version"

    const val composeToolingDebug = "androidx.compose.ui:ui-tooling:$compose_ui_version"

    //const val composeToolingRelease
    const val composeActivity = "androidx.activity:activity-compose:1.4.0"
    const val util = "androidx.compose.ui:ui-util:$compose_ui_version"

}

object ComposeDestination {
    private const val version = "1.7.21-beta"
    const val composeDestination =
        "io.github.raamcosta.compose-destinations:animations-core:$version"
    const val composeDestinationPlugin = "io.github.raamcosta.compose-destinations:ksp:$version"
    const val core = "io.github.raamcosta.compose-destinations:core:$version"
}

object Coroutines {

    private const val coroutineVersion = "1.6.4"

    val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion"
}

object Koin {
    private const val version = "3.1.2"
    const val koinAndroid = "io.insert-koin:koin-androidx-compose:$version"
    const val koin = "io.insert-koin:koin-core:3.1.4"
}

object KotlinPlugins {
    const val android = "android"
    const val multiplatform = "multiplatform"
    const val cocoapods = "native.cocoapods"
    const val serialization = "plugin.serialization"
    const val parcelize = "kotlin-parcelize"
}

object Kotlinx {
    private const val kotlinxSerialization = "1.3.3"
    private const val kotlinxDatetimeVersion = "0.3.3"
    const val datetime = "org.jetbrains.kotlinx:kotlinx-datetime:${kotlinxDatetimeVersion}"
    const val serializationCore =
        "org.jetbrains.kotlinx:kotlinx-serialization-core:${kotlinxSerialization}"
}

object Ktor {
    private const val ktorVersion = "2.1.0"
    const val clientCore = "io.ktor:ktor-client-core:${ktorVersion}"
    const val clientJson = "io.ktor:ktor-client-json:${ktorVersion}"
    const val clientLogging = "io.ktor:ktor-client-logging:${ktorVersion}"
    const val clientSerialization = "io.ktor:ktor-client-serialization:${ktorVersion}"
    const val contentNegotiation = "io.ktor:ktor-client-content-negotiation:${ktorVersion}"
    const val json = "io.ktor:ktor-serialization-kotlinx-json:${ktorVersion}"

    const val clientAndroid = "io.ktor:ktor-client-android:${ktorVersion}"

    const val clientIos = "io.ktor:ktor-client-ios:${ktorVersion}"
}

object Material3 {
    private const val version = "1.0.0-rc01"
    val material3 = "androidx.compose.material3:material3:$version"
    val window = "androidx.compose.material3:material3-window-size-class:$version"
}

object SplashScreen {
    private const val version = "1.0.0-beta02"
    const val splashScreen = "androidx.core:core-splashscreen:$version"
}