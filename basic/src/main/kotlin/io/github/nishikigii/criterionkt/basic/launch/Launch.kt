package io.github.nishikigii.criterionkt.basic.launch

import io.github.nishikigii.criterionkt.basic.launch.launcher.Launcher

/**
 * could be launched to process.
 */
interface Launch
{
    fun launcher(): Launcher

}