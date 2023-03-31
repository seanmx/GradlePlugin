plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("me.sean.config.plugin")
}

android {
    namespace = "me.sean.gradleplugin"
    compileSdk = 33

    defaultConfig {
        applicationId = "me.sean.gradleplugin"
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

}