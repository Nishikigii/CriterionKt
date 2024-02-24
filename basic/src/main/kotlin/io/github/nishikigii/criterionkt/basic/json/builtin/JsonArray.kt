package io.github.nishikigii.criterionkt.basic.json.builtin

import io.github.nishikigii.criterionkt.basic.json.JsonElement
import io.github.nishikigii.criterionkt.basic.json.RootElement

class JsonArray( vararg entries: JsonElement ): RootElement
{

    private val entries = arrayOf(entries)

    override fun display() = ""

    override fun toString() = display()
}