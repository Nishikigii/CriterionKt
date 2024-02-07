package test.basic

import io.github.nishikigii.criterionkt.basic.java.Java
import java.io.File

/**
 *
 */
fun main()
{
    val java = Java.fromHome(File("/Library/Java/JavaVirtualMachines/jdk/zuluJDK 17 FX/Contents/Home"))

    println( java )
}