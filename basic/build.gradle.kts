plugins {
    kotlin("jvm")
    id("maven-publish")
}

group = "io.github.nishikigii.criterionkt"
version = "0.0.0"

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin SDK
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("local") {
            from(components["java"])
        }
    }
    repositories {
        mavenLocal()
    }
}

kotlin {
    jvmToolchain(11)
}