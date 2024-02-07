package io.github.nishikigii.criterionkt.basic.java.arguments.jvm

import io.github.nishikigii.criterionkt.basic.java.arguments.jvm.JvmArgsScope

/**
 *
 */
fun JvmArgsScope.d( key: String, value: String, `when`: Boolean = true )
{
    if ( `when` ) getEditable().add("-D\"$key\"=\"$value\"")
}