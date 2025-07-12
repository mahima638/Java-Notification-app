plugins {
    alias(myLibs.plugins.androidApplication)
    alias(myLibs.plugins.kotlinAndroid)
    alias(myLibs.plugins.google.services) // Firebase plugin
}

android {
    namespace = "com.example.notificationapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.notificationapp"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(myLibs.appcompat)
    implementation(myLibs.material)
    implementation(myLibs.activity)
    implementation(myLibs.constraintlayout)
    implementation("androidx.core:core:1.12.0")


    // Firebase BOM - Bill of Materials
    implementation(platform(myLibs.firebase.bom))

    // Firebase Core (analytics)
    implementation(myLibs.firebase.core)

    // Firebase Messaging
    implementation("com.google.firebase:firebase-messaging:24.0.0")

    testImplementation(myLibs.junit)
    androidTestImplementation(myLibs.ext.junit)
    androidTestImplementation(myLibs.espresso.core)
}
