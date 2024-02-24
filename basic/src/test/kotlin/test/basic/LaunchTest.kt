package test.basic

import io.github.nishikigii.criterionkt.basic.java.Java
import io.github.nishikigii.criterionkt.basic.java.Parameters.MainClass

/**
 *
 */
fun main()
{
    val parm = arrayOf (
        *MainClass.fromJar("/Users/andei_buite/Downloads/client-1.2.0.jar")
    )

    val process = Java.fromCurrent().launcher( *parm ).process()
}
