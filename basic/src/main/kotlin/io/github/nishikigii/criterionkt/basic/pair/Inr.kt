package io.github.nishikigii.criterionkt.basic.pair

/**
 * USAGE: "key" inr "value"
 */
infix fun <K,V> K.inr( value: V ) = Pair(this,value)