package io.github.nishikigii.criterionkt.basic.format

/**
 * export as a specific format.
 */
interface Format
{
    fun toExportable(): String = this.toString()

}