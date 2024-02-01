plugins {
    kotlin("jvm")
}

group = "io.github.nishikigii.criterionkt"
version = "0.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    api( project(":basic") )
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}