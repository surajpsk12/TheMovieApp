plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.surajvanshsv.themovieapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.surajvanshsv.themovieapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    // Retrofit
    implementation (libs.retrofit)

// GSON converter (for JSON parsing)
    implementation (libs.converter.gson)

// (Optional but recommended) Logging Interceptor for debugging network calls
    implementation (libs.logging.interceptor)

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}