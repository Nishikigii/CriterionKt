package io.github.nishikigii.criterionkt.terminal.application

/**
 * scope of terminal application.
 * the scope will be destroyed when the terminal application that corresponds to it ends.
 * and the terminal application should be destroyed as soon as the scope dying too.
 */
interface TemAppScope
{

    /**
     * end scope and its terminal application.
     * implementer should define how the terminal application ends and map its calling to this method.
     *
     * @param exitCode exit code and it should be 0 normally
     * @param prepare the task that should be performed before the scope and its terminal application exits
     */
    fun exitApplication( exitCode: Int, prepare: TemAppScope.()->Unit )

}

