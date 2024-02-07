package io.github.nishikigii.criterionkt.basic.java.arguments.app

import io.github.nishikigii.criterionkt.basic.java.arguments.ArgsScope

/**
 * application arguments.
 */
fun ArgsScope.application( content: AppArgsScope.()->Unit )
{
    val editable = getEditable()
    val result = ArrayList<String>()
    val scope = object: AppArgsScope
    {
        override fun getEditable() = result
    }
    scope.content()
    editable.addAll(result)
}


/**
 * application arguments definition scope.
 */
interface AppArgsScope
{
    fun getEditable(): ArrayList<String>
}