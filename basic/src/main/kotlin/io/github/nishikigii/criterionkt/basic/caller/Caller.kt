package io.github.nishikigii.criterionkt.basic.caller

/**
 * get function caller name.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun callerName(): StackTraceElement
{
    val stackTrace = Thread.currentThread().stackTrace
    if (stackTrace.size > 2)
        return stackTrace[2]
    throw Exception("fail to get caller name.")
}