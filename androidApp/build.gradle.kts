plugins {
    id("com.android.application")
    kotlin("android")
    id("com.google.devtools.ksp") version "1.7.10-1.0.6"
}

android {
    namespace = "com.emirli.movies.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.emirli.movies.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))

    with(Compose) {
        implementation(util)
        implementation(composeMaterial)
        implementation(composeToolingDebug)
        implementation(composeUI)
      //  implementation(navigation)
    }
    with(Accompanist) {
        implementation(coil)
        implementation(webview)
    }
    with(Koin){
        implementation(koinAndroid)
    }
    with(ComposeDestination) {
        implementation(composeDestination)
      //  ksp(composeDestinationPlugin)
    }
}