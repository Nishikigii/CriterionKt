package test.basic

import io.github.nishikigii.criterionkt.basic.Index.First
import io.github.nishikigii.criterionkt.basic.Index.Last
import io.github.nishikigii.criterionkt.basic.format.builtin.move
import io.github.nishikigii.criterionkt.basic.format.export

fun main()
{
    val target = "01234567"
    val result = target.export {
        move("234", Last )
        move("567", First )
    }
    println( result )
}
