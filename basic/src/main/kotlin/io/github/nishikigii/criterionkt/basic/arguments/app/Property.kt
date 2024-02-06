package io.github.nishikigii.criterionkt.basic.arguments.app

/**
 *
 */
fun AppArgsScope.property( key: String, value: String, `when`: Boolean )
{
    if ( `when` ) getEditable().add("--$key=$value")
}