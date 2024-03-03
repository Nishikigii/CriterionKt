package test.basic

import io.github.nishikigii.criterionkt.json.builtin.JsonArray

/**
 *
 */
fun main()
{
    val array = JsonArray("abc","abc","abc").add("abc","abc","abc")

    println( array )

}