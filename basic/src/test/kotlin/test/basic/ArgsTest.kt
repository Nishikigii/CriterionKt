package test.basic

import io.github.nishikigii.criterionkt.basic.java.arguments.app.application
import io.github.nishikigii.criterionkt.basic.java.arguments.jvm.d
import io.github.nishikigii.criterionkt.basic.java.arguments.arguments
import io.github.nishikigii.criterionkt.basic.java.arguments.jvm.jvm
import io.github.nishikigii.criterionkt.basic.java.arguments.jvm.mainClass

/**
 *
 */
fun main()
{
    println(  )
    val arguments = arguments {
        jvm {
            d("test", "value")
            d("a", "b")
            mainClass("main.main.Main")
        }
        application {

        }
    }

    println( arguments.toString() )
}