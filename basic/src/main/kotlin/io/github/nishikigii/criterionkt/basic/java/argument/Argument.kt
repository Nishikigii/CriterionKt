package io.github.nishikigii.criterionkt.basic.java.argument

import io.github.nishikigii.criterionkt.basic.java.argument.element.Element

/**
 *
 */
fun argument( content: ArgScope.()->Unit ): MutableMap<Element,ArrayList<String>>
{
    val result = mutableMapOf<Element, ArrayList<String> >()
    val scope = object: ArgScope
    {
        override fun getEditable() = result
    }
    scope.content()
    return result
}



interface ArgScope
{
    fun getEditable(): MutableMap<Element, ArrayList<String> >
}