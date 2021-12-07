plugins {
    id("com.android.application")
    id("kotlin-android")
    id("com.github.triplet.play") version "3.7.0"
}

android {
    compileSdk = 31
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "de.ah.tpprepro"
        minSdk = 26
        targetSdk = 31
        versionCode = 1
        versionName = "1.1"
    }
}

dependencies {
}