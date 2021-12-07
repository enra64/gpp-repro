plugins {
    id("com.android.application")
    id("com.github.triplet.play") version "3.7.0"
    id("kotlin-android")
    id("org.jlleitschuh.gradle.ktlint") version "10.1.0"
}

android {
    compileSdk = 31
    buildToolsVersion = "30.0.3"
    ndkVersion = "21.3.6528147"

    defaultConfig {
        applicationId = "de.ah.tpprepro"
        minSdk = 23
        targetSdk = 31
        versionCode = 1
        versionName = "1.1"
    }

    dynamicFeatures.addAll(setOf(":dynamicfeature"))
}

if (project.hasProperty("ci")) {
    play {
        // internal: oviva
        // alpha: prod
        // beta, production: not used
        track.set("alpha")
        serviceAccountCredentials.set(file(System.getenv("PLAY_SERVICE_ACCOUNT_PATH")))
        commit.set(true)
    }
}

dependencies {
}
