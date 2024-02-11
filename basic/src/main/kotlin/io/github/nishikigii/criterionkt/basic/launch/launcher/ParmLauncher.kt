package io.github.nishikigii.criterionkt.basic.launch.launcher

import io.github.nishikigii.criterionkt.basic.launch.argument.Parm


/**
 *
 */
abstract class ParmLauncher<ValueType>( val arguments: MutableMap<Parm<ValueType>, ValueType> ): Launcher()
{
    abstract override fun process(): Process

}