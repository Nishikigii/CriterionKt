package io.github.nishikigii.criterionkt.basic.pair

import io.github.nishikigii.criterionkt.basic.serialize.Profile

/**
 * key-value pair
 */
open class Pair<K,V> (

    var key: K,

    var value: V,

    val split: String = ":"

): Profile<String>
{

    private fun display() = "$key$split$value"

    override fun serialize() = display()

    override fun toString() = display()

}