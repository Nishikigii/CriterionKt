package io.github.nishikigii.criterionkt.basic.launch.launcher

/**
 * launch class as a process.
 */
abstract class Launcher
{

    /**
     * launch a new process with the class.
     */
    abstract fun process(): Process

}