package test.criterionkt.logging

import io.github.nishikigii.criterionkt.logging.Level.Tips
import io.github.nishikigii.criterionkt.logging.saveLog

/**
 *
 */
fun main()
{
    saveLog("abc", Tips)
    Thread.sleep(3000)
}