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
    // Http Client
    implementation("org.apache.httpcomponents.client5:httpclient5:5.3.1")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    // Logging
    api("org.slf4j:slf4j-api:1.7.36")
    api("org.apache.logging.log4j:log4j-slf4j-impl:2.22.0")
    api("org.apache.logging.log4j:log4j-api:2.22.0")
    api("org.apache.logging.log4j:log4j-core:2.22.0")
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