plugins {
    kotlin("jvm") version "1.9.20"
}

group = "io.github.nishikigii"
version = "0.0.0"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}