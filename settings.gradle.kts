plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "CriterionKt"

include("basic")
include("utils")
include("terminal")
include("json")
include("logging")
