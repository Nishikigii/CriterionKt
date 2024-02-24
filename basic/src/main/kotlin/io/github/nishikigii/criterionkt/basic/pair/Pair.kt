package io.github.nishikigii.criterionkt.basic.pair

import java.io.Serializable

/**
 * key-value pair
 */
open class Pair<K,V> (

    var key: K,

    var value: V,

    val split: Char?

): Serializable
{

    constructor( key: K, value: V ): this(key, value, ':')

    override fun toString() = "$key${split ?: ""}$value"

}