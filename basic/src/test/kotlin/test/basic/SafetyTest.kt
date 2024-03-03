package test.basic

import io.github.nishikigii.criterionkt.basic.result.Safety
import io.github.nishikigii.criterionkt.basic.result.unstable

/**
 *
 */
fun main()
{
    val result = function().excepted {
        ""
    }
}

private fun function(): Safety<String> = unstable(Throwable())