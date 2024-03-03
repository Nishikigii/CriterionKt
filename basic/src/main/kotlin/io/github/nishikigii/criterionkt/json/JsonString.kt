package io.github.nishikigii.criterionkt.json

/**
 *
 */
open class JsonString( private val root: RootElement)
{
    override fun toString() = root.display()

}