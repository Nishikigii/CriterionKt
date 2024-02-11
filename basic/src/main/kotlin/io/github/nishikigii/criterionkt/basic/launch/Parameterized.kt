package io.github.nishikigii.criterionkt.basic.launch

import io.github.nishikigii.criterionkt.basic.launch.launcher.ParmLauncher


/**
 * support for parameterized startup on a launchable basis.
 */
interface Parameterized<ParmType>
{
    fun launcher(): ParmLauncher<ParmType>

}