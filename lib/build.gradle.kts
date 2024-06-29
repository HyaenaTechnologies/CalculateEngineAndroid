plugins {
    id("com.android.application")
    id("org.gradle.android.cache-fix")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    buildFeatures {
        buildConfig = true
        compose = true
    }

    buildToolsVersion = "34.0.0"

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

    compileSdk = 34

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }

    defaultConfig {
        applicationId = "calculate_engine"
        minSdk = 21
        targetSdk = 34
        testInstrumentationRunner = "androidx.test.runner"
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    namespace = "calculate_engine"

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    ndkVersion = "27.0.11718014"
}

val androidxCompose: String = "1.6.8"
val androidxLifecycle: String = "2.8.2"
val androidxNavigation: String = "2.7.7"
val ioKtor: String = "2.3.12"
val jetBrainsKotlin: String = "2.0.0"
val orgJetBrainsKotlinXCoroutines: String = "1.9.0-RC"
val orgJetBrainsKotlinXIO: String = "0.4.0"
val orgJetBrainsKotlinXSerialization: String = "1.7.1"

dependencies {
    // Android
    implementation("com.android.tools.compose:compose-preview-detector:31.6.0-alpha08")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation("androidx.compose.animation:animation:$androidxCompose")
    implementation("androidx.compose.compiler:compiler:1.5.14")
    implementation("androidx.compose.foundation:foundation:$androidxCompose")
    implementation("androidx.compose.material:material:$androidxCompose")
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.compose.runtime:runtime:$androidxCompose")
    implementation("androidx.compose.ui:ui:$androidxCompose")
    implementation("androidx.compose.ui:ui-text-google-fonts:$androidxCompose")
    implementation("androidx.compose.ui:ui-tooling:$androidxCompose")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:$androidxLifecycle")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$androidxLifecycle")
    implementation("androidx.navigation:navigation-common-ktx:$androidxNavigation")
    implementation("androidx.navigation:navigation-compose:$androidxNavigation")
    implementation("androidx.navigation:navigation-ui-ktx:$androidxNavigation")
    implementation("androidx.paging:paging-compose:3.3.0")
    implementation("com.google.android.material:compose-theme-adapter:1.2.1")
    implementation("com.google.android.material:compose-theme-adapter-3:1.1.1")
    implementation("com.google.android.material:compose-theme-adapter-core:1.0.1")
    // KTOR
    implementation("io.ktor:ktor-client-auth:$ioKtor")
    implementation("io.ktor:ktor-client-core:$ioKtor")
    implementation("io.ktor:ktor-client-cio:$ioKtor")
    implementation("io.ktor:ktor-client-content-negotiation:$ioKtor")
    implementation("io.ktor:ktor-client-encoding:$ioKtor")
    implementation("io.ktor:ktor-client-json:$ioKtor")
    implementation("io.ktor:ktor-client-logging:$ioKtor")
    implementation("io.ktor:ktor-client-resources:$ioKtor")
    implementation("io.ktor:ktor-client-serialization:$ioKtor")
    implementation("io.ktor:ktor-events:$ioKtor")
    implementation("io.ktor:ktor-http:$ioKtor")
    implementation("io.ktor:ktor-http-cio:$ioKtor")
    implementation("io.ktor:ktor-io:$ioKtor")
    implementation("io.ktor:ktor-network:$ioKtor")
    implementation("io.ktor:ktor-network-tls:$ioKtor")
    implementation("io.ktor:ktor-network-tls-certificates:$ioKtor")
    implementation("io.ktor:ktor-resources:$ioKtor")
    implementation("io.ktor:ktor-serialization:$ioKtor")
    implementation("io.ktor:ktor-serialization-kotlinx:$ioKtor")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ioKtor")
    implementation("io.ktor:ktor-utils:$ioKtor")
    implementation("io.ktor:ktor-websockets:$ioKtor")
    implementation("io.ktor:ktor-websocket-serialization:$ioKtor")
    // JetBrains
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$jetBrainsKotlin")
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.7")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$orgJetBrainsKotlinXCoroutines")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$orgJetBrainsKotlinXCoroutines")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-io-bytestring:$orgJetBrainsKotlinXIO")
    implementation("org.jetbrains.kotlinx:kotlinx-io-core:$orgJetBrainsKotlinXIO")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$orgJetBrainsKotlinXSerialization")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$orgJetBrainsKotlinXSerialization")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-properties:$orgJetBrainsKotlinXSerialization")
    implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.9.0")
    // Tests
    androidTestImplementation("androidx.compose.ui:ui-test:$androidxCompose")
    androidTestImplementation("androidx.navigation:navigation-testing:$androidxNavigation")
    testImplementation("io.ktor:ktor-client-tests:$ioKtor")
    testImplementation("io.ktor:ktor-client-content-negotiation-tests:$ioKtor")
    testImplementation("io.ktor:ktor-serialization-tests:$ioKtor")
    testImplementation("io.ktor:ktor-serialization-kotlinx-tests:$ioKtor")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$jetBrainsKotlin")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$orgJetBrainsKotlinXCoroutines")
    testImplementation("org.jetbrains.kotlinx:lincheck:2.32")
}