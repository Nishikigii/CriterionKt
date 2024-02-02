package test.basic

import io.github.nishikigii.criterionkt.basic.system.SystemType.Android
import io.github.nishikigii.criterionkt.basic.system.SystemType.Linux
import io.github.nishikigii.criterionkt.basic.system.SystemType.Windows
import io.github.nishikigii.criterionkt.basic.system.currentSystemType

fun main()
{
    currentSystemType.matches(Windows, Linux, Android) {
        println("true")
    }
}