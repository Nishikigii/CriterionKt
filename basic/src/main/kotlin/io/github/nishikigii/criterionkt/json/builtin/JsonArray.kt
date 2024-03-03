package io.github.nishikigii.criterionkt.json.builtin

import io.github.nishikigii.criterionkt.json.RootElement

class JsonArray( vararg entries: RootElement): RootElement
{

    constructor( vararg entries: String ): this( *entries.map { JsonField(it) }.toTypedArray() )


    private val entries = entries.toMutableList()

    fun add( vararg entries: RootElement) = apply {
        this.entries.addAll(entries.toList())
    }

    fun add( vararg entries: String ) = apply {
        this.entries.addAll(entries.map { JsonField(it) })
    }

    @OptIn(ExperimentalUnsignedTypes::class)
    fun remove( vararg indexes: UInt ) = apply {
        indexes.forEach {
            entries.removeAt(it.toInt())
        }
    }

    override fun display() = "[${entries.joinToString(",") { it.display() }}]"

    override fun toString() = display()
}