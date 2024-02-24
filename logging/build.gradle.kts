plugins {
    kotlin("jvm")
}

group = "io.github.nishikigii.criterionkt"

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin SDK
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    api( project(":basic") )
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}