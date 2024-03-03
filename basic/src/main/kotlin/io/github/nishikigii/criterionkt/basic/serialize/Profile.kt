package io.github.nishikigii.criterionkt.basic.serialize

import java.io.Serializable

/**
 * just like interface Serializable.
 * T: serializing result type.
 */
interface Profile<T>: Serializable
{
    /**
     * serialize this object instance.
     */
    fun serialize(): T

}