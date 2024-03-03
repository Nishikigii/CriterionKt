package io.github.nishikigii.criterionkt.basic.launch


/**
 * support for parameterized launch.
 */
interface Parameterized
{
    fun launcher( vararg parm: Parameter ): Launcher

}