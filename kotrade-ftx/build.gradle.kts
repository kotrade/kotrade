plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":kotrade-core"))
    implementation(kotlin("stdlib"))
}