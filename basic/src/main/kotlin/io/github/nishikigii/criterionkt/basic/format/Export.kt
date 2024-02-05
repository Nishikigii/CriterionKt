package io.github.nishikigii.criterionkt.basic.format

/**
 * export object to string as specific format.
 */
fun Format.export(): String
{
    val builder = StringBuilder()
    return builder.toString()
}


fun String.export( formats: ExportScope.()->Unit ): String
{
    val charArray = this.toCharArray()
    val scope = object: ExportScope
    {
        override fun getEditable() = charArray
    }
    scope.formats()
    return String(charArray)
}