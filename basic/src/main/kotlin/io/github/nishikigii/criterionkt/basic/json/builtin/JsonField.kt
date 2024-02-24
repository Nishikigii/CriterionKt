package io.github.nishikigii.criterionkt.basic.json.builtin

import io.github.nishikigii.criterionkt.basic.json.JsonElement

/**
 * special json element that gives support to String be joined into json.
 * this class is unregistered in the register book, try to avoid using it outside the framework!
 */
class JsonField( val field: String ): JsonElement
{
    override fun display() = field

    override fun toString() = field

}