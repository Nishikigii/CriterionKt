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
    api( project(":basic") )
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


tasks.test {
    useJUnitPlatform()
}


kotlin {
    jvmToolchain(11)
}