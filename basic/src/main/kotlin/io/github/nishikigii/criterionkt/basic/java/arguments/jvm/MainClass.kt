package io.github.nishikigii.criterionkt.basic.java.arguments.jvm

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