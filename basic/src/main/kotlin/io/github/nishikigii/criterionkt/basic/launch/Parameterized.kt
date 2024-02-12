package io.github.nishikigii.criterionkt.basic.launch

import io.github.nishikigii.criterionkt.basic.format.Format
import io.github.nishikigii.criterionkt.basic.launch.argument.Parm
import io.github.nishikigii.criterionkt.basic.launch.launcher.ParmLauncher


/**
 * support for parameterized startup on a launchable basis.
 */
interface Parameterized<ParmType>: Format
{
    fun launcher( vararg parm: Pair<Parm<ParmType>,ParmType> ): ParmLauncher<ParmType>

    fun exportParm(): String

    override fun toExportable() = exportParm()

}