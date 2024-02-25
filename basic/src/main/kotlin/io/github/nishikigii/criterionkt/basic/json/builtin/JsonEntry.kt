package io.github.nishikigii.criterionkt.basic.json.builtin

import io.github.nishikigii.criterionkt.basic.json.JsonElement

class JsonEntry( var key: String, var value: JsonElement): JsonElement
{
    constructor( key: String, value: String ): this( key = key, JsonField(value) )

    override fun display() = "\"key\":${value.display()}"

    override fun toString() = display()

}