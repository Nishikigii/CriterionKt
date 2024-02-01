package io.github.nishikigii.criterionkt.basic

import java.io.Serializable

// 键值对
data class Pair<K: Serializable,V: Serializable> (

    var key: K,

    var value: V,

    var split: Char = '='

): Serializable
{
    override fun toString() = "$key$split$value"
}