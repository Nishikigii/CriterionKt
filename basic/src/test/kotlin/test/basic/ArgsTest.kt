package test.basic

import io.github.nishikigii.criterionkt.basic.arguments.app.application
import io.github.nishikigii.criterionkt.basic.arguments.arguments
import io.github.nishikigii.criterionkt.basic.arguments.jvm.jvm

/**
 *
 */
fun main()
{
    val args = arguments {
        jvm {

        }
        application {

        }
    }

    println( args )
}