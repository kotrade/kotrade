plugins {
    kotlin("jvm")
    kotlin("plugin.serialization") version "1.6.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":kotrade-core"))
    implementation(kotlin("stdlib"))
}