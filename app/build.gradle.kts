kotlin
plugins {
    id("com.android.application") version "8.1.0" apply false
    kotlin("android") version "1.8.0" apply false
}

allprojects {
    repositories {
        google() // Include Google's Maven repository
        mavenCentral() // Include Maven Central repository
    }
}

android {
    compileSdk = 33 // Use the latest SDK version

    defaultConfig {
        applicationId = "com.thru" // Unique application ID
        minSdk = 21 // Minimum SDK version
        targetSdk = 33 // Target SDK version
        versionCode = 1 // Version code
        versionName = "1.0" // Version name
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false // Disable minification for release builds
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    kotlinOptions {
        jvmTarget = "1.8" // Set the JVM target
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0") // Kotlin Standard Library
    implementation(platform("com.google.firebase:firebase-bom:32.1.0")) // Firebase Bill of Materials
    implementation("com.google.firebase:firebase-analytics-ktx") // Firebase Analytics
    implementation("com.google.firebase:firebase-firestore-ktx") // Firestore for database
    implementation("com.google.firebase:firebase-auth-ktx") // Firebase Authentication
    implementation("com.google.android.material:material:1.8.0") // Material Design components
    implementation("com.squareup.retrofit2:retrofit:2.9.0") // Retrofit for networking
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // Gson converter for Retrofit
    implementation("com.github.razorpay:checkout:1.6.11") // Razorpay SDK for payment processing
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0") // Lifecycle components
    implementation("androidx.activity:activity-ktx:1.6.0") // Activity KTX
    implementation("androidx.appcompat:appcompat:1.6.0") // AppCompat library for backward compatibility
    implementation("androidx.core:core-ktx:1.10.0") // Core KTX library
}