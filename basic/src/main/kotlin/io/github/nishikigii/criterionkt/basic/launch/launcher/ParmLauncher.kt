package io.github.nishikigii.criterionkt.basic.launch.launcher

import io.github.nishikigii.criterionkt.basic.launch.argument.Parm
import io.github.nishikigii.criterionkt.basic.pair.Pair


/**
 *
 */
abstract class ParmLauncher<ValueType>( vararg parm: Pair<Parm<ValueType>, ValueType> )
{
    abstract fun process(): Process
}