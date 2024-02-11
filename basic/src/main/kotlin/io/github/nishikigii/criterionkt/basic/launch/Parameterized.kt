package io.github.nishikigii.criterionkt.basic.launch

import io.github.nishikigii.criterionkt.basic.launch.launcher.ParmLauncher


/**
 * support for parameterized startup on a launchable basis.
 */
interface Parameterized<ParmType>: Launch
{
    override fun launcher(): ParmLauncher<ParmType>

}