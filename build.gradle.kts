plugins {
    kotlin("jvm") version "1.6.10"
}

group = "io.kotrade"
version = "1.0-SNAPSHOT"



allprojects {

    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-reflect:1.6.10")
        implementation("io.ktor:ktor-client-logging:2.0.0")
        implementation("io.ktor:ktor-client-okhttp:2.0.0")
        implementation("io.ktor:ktor-client-cio:2.0.0")
        implementation("io.ktor:ktor-serialization-kotlinx-json:2.0.0")
        implementation("io.ktor:ktor-client-websockets:2.0.0")
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.2")
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
        implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.3.2")
        implementation(kotlin("stdlib"))
    }
}