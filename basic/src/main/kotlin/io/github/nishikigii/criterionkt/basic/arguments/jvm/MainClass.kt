package io.github.nishikigii.criterionkt.basic.arguments.jvm

/**
 *
 */
fun JvmArgsScope.mainClass( clazz: String )
{
    getEditable().add(clazz)
}


/**
 *
 */
fun JvmArgsScope.mainClass( clazz: Class<Any> ) = mainClass( clazz.name )