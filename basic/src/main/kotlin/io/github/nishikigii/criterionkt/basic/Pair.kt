package io.github.nishikigii.criterionkt.basic

import java.io.Serializable

// 键值对
data class Pair<K,V> (

    var key: K,

    var value: V,

): Serializable
{
    var split: Char = '='

    override fun toString() = "$key$split$value"
}