package io.github.nishikigii.criterionkt.logging

import io.github.nishikigii.criterionkt.basic.caller.callerName
import io.github.nishikigii.criterionkt.logging.Level.Color
import io.github.nishikigii.criterionkt.logging.Level.Error
import io.github.nishikigii.criterionkt.logging.Level.Information
import io.github.nishikigii.criterionkt.logging.Level.Tips
import io.github.nishikigii.criterionkt.logging.Level.Warning
import io.github.nishikigii.criterionkt.logging.Level.Exception
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.File
import java.io.PrintStream
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.Result.Companion.failure
import kotlin.Result.Companion.success


/**
 * print and save logging.
 */
fun logging( content: String )
{

}


private val saveCoroutine = object: CoroutineScope
{
    override val coroutineContext = Dispatchers.IO
}


/**
 * save logging into files.
 */
fun saveLog (
    content: String,
    level: Level,
    folder: String = "./log"
)
{
    val caller = callerName().className.substringAfterLast('.')
    when (level) {
        Tips, Information -> saveCoroutine.launch {
            val dir = File(folder).apply { mkdirs() }
            val file = File(dir,"normal.log").apply { createNewFile() }
            val log = createLog( content = "[${level.tag}]$content", endln = true, caller = caller ).fold(
                onFailure = { throw LoggingException.create("fail to create log message") },
                onSuccess = { it }
            )
            file.appendText(log)
        }
        Warning, Exception, Error -> saveCoroutine.launch {
            val file = File("$folder/unusual.log")
        }
    }
}

/**
 * print logging into printable streams.
 */
fun printLog (
    content: String,
    level: Level = Information,
    endln: Boolean = true,
    color: Color = level.color,
    block: Boolean = true,
    vararg local: PrintStream = arrayOf(System.out)
)
{
    val log = createLog( content = content, endln = endln ).fold(
        onFailure = { throw LoggingException.create("fail to create log message") },
        onSuccess = { it }
    )

    println( log )

}


private class LoggingException private constructor( msg: String ): java.lang.Exception( msg )
{
    companion object
    {
        fun create( msg: String = "unknown cause" ) = LoggingException(msg).apply {
            saveLog(this.stackTraceToString(), level = Level.Exception)
        }
    }

}


/**
 * create a log message.
 */
@Suppress("NOTHING_TO_INLINE")
private inline fun createLog( content: String, endln: Boolean, caller: String? = null ): Result<String>
{
    if ( content.isEmpty() ) {
        return failure(LoggingException.create("empty content when creating log message"))
    }
    val time = LocalDateTime.now().format( DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss") )
    val callerName = caller ?: callerName().className.substringAfterLast('.')
    return success("[$time][$callerName] $content ${ if (endln) '\n' else "" }")
}