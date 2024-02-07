package io.github.nishikigii.criterionkt.basic.java.arguments.jvm

/**
 *
 */
fun JvmArgsScope.x( content: XargsScope.()->Unit )
{
    val editable = getEditable()
    val result = ArrayList<String>()
    val scope = object: XargsScope
    {
        override fun getEditable() = result
    }
    scope.content()
    editable.addAll(result)
}

interface XargsScope
{
    fun getEditable(): ArrayList<String>

}