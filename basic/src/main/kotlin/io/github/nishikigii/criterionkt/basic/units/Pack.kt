package io.github.nishikigii.criterionkt.basic.units

/**
 * an information package with units of measure.
 */
data class Pack<T> (

    // units of measure to the information package
    val unit: Unit,

    // value of the information package
    val value: T

)