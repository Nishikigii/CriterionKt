package test.basic

import io.github.nishikigii.criterionkt.basic.arguments.app.application
import io.github.nishikigii.criterionkt.basic.arguments.jvm.d
import io.github.nishikigii.criterionkt.basic.arguments.arguments
import io.github.nishikigii.criterionkt.basic.arguments.jvm.jvm
import io.github.nishikigii.criterionkt.basic.arguments.jvm.mainClass

/**
 *
 */
fun main()
{
    val arguments = arguments {
        jvm {
            mainClass("main.main.Main")
            d("test", "value")
            d("a", "b")
        }
        application {

        }
    }

    println( arguments.toString() )
}