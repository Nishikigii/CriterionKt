package io.github.nishikigii.criterionkt.basic.java.arguments.app

/**
 *
 */
fun AppArgsScope.property( key: String, value: String, `when`: Boolean )
{
    if ( `when` ) getEditable().add("--$key=$value")
}