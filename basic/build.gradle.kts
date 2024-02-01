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
    testImplementation("org.jetbrains.kotlin:kotlin-test")
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