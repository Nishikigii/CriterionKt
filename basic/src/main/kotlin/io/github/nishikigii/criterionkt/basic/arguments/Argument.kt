package io.github.nishikigii.criterionkt.basic.arguments

/**
 *
 */
data class Argument (

    val jvmOptions: List<String>,

    val properties: List<Pair<String,String>>,

    val mainClass: String,

    val appArgs: List<String>

)