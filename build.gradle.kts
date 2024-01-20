// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0-beta01" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}

println("Value of Secret: ${System.getenv("AWS_CODE_ARTIFACT_DEFAULT_REGION")}")
println("Value of Env variable: ${System.getenv("SAMPLE")}")
