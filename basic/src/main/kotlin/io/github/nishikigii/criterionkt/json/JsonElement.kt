package io.github.nishikigii.criterionkt.json

import io.github.nishikigii.criterionkt.basic.format.Format
import java.io.Serializable


/**
 * element of json string such as json object.
 * you should update the book if you register a new implementation.
 * @see RegisterBook enum of the implementations registered.
 */
interface JsonElement: Serializable, Format
{
    /**
     * definition of how the displayed in the json string.
     */
    fun display(): String

    /**
     * This function is often used when the element is concatenated.
     * it is recommended to call display() directly.
     */
    override fun toString(): String
}