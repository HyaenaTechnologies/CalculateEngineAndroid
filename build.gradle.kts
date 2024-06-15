plugins {
    val com_android = "8.5.0"
    val org_jetbrains_kotlin = "2.0.0"

    id("com.android.application") version "$com_android" apply false
    id("com.android.library") version "$com_android" apply false
    id("io.ktor.plugin") version "2.3.11" apply false
    id("org.gradle.android.cache-fix") version "3.0.1" apply false
    id("org.jetbrains.kotlin.android") version "$org_jetbrains_kotlin" apply false
    id("org.jetbrains.kotlin.jvm") version "$org_jetbrains_kotlin" apply false
    id("org.jetbrains.kotlin.js") version "$org_jetbrains_kotlin" apply false
    id("org.jetbrains.kotlin.multiplatform") version "$org_jetbrains_kotlin" apply false
}