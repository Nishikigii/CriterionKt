package io.github.nishikigii.criterionkt.basic.format.builtin

import io.github.nishikigii.criterionkt.basic.Index
import io.github.nishikigii.criterionkt.basic.Index.First
import io.github.nishikigii.criterionkt.basic.Index.Last
import io.github.nishikigii.criterionkt.basic.Index.Order
import io.github.nishikigii.criterionkt.basic.format.ExportScope
import java.lang.IllegalArgumentException
import java.util.ArrayList
import kotlin.collections.Map.Entry


/**
 * move contents inside object to a specific location.
 *
 * @param moved all child strings match the regex will be moved
 * @param order defined that the moved should before or after target location
 * @param to target location as regex
 * @param multipleTargets defined which should be selected when multiple targets satisfy the Regex
 */
fun ExportScope.move( moved: Regex, order: Order, to: Regex, multipleTargets: Index = First )
{
    TODO()
}

/**
 * move contents inside object to a specific location.
 *
 * @param moved all child strings same to it will be moved
 * @param order defined that the moved should before or after target location
 * @param to target location as child string
 * @param multipleTargets defined which should be selected when multiple targets satisfy the Regex
 * @see move
 */
fun ExportScope.move( moved: String, order: String, to: Regex, multipleTargets: Index = First )
{
    TODO()
}

/**
 * move contents inside object to a specific index.
 *
 * @param moved all child strings match the regex will be moved
 * @param to target location
 * @see move
 */
fun ExportScope.move( moved: Regex, to: Index )
{
    TODO()
}

/**
 * move contents inside object to a specific index.
 *
 * @param moved all child strings same to it will be moved
 * @param to target location
 * @see move
 */
fun ExportScope.move( moved: String, to: Index )
{
    val origin = getEditable()
    val matchingChars = origin.filter { it in moved }
    val nonMatchingChars = origin.filter { it !in moved }
    val result = when( to ) {
        Last-> nonMatchingChars.toCharArray() + matchingChars.toCharArray()
        First-> matchingChars.toCharArray() + nonMatchingChars
        else-> throw IllegalArgumentException("target location are First and Last allowed only")
    }
    result.copyInto(origin)
}
