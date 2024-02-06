package io.github.nishikigii.criterionkt.basic.arguments.jvm

import io.github.nishikigii.criterionkt.basic.arguments.ArgsScope

/**
 * java virtual machine start up and runtime arguments.
 */
fun ArgsScope.jvm( content: JvmArgsScope.()->Unit )
{
    val editable = getEditable()
    val result = ArrayList<String>()
    val scope = object: JvmArgsScope {
        override fun getEditable() = result
    }
    scope.content()
    editable.addAll(result)
}

/**
 *
 */
interface JvmArgsScope
{
    fun getEditable(): ArrayList<String>
}