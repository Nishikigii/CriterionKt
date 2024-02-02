package io.github.nishikigii.criterionkt.terminal.application

import kotlin.system.exitProcess


/**
 * a terminal application that is presented as a function
 *
 * @param task tasks that need to be preformed in the scope of the terminal application
 */
fun terminalApplication( task: TemAppScope.()-> Unit )
{
    val scope = object: TemAppScope {

        override fun exitTemApp( exitCode: Int, prepare: TemAppScope.()->Unit ) {
            this.task()
            exitProcess( exitCode )
        }

    }
    scope.task()
}

