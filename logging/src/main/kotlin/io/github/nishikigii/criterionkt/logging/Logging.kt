package io.github.nishikigii.criterionkt.logging

import io.github.nishikigii.criterionkt.logging.Package.Block
import io.github.nishikigii.criterionkt.logging.Package.Block.Background
import io.github.nishikigii.criterionkt.logging.Package.Block.Suspend
import io.github.nishikigii.criterionkt.logging.Package.Color
import io.github.nishikigii.criterionkt.logging.Package.None
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


object LoggingScope: CoroutineScope
{
    override val coroutineContext = Dispatchers.IO
}

fun logging (

    content: String,

    packaging: Package = None,

    level: Block = packaging.level,

    color: Color = packaging.color

) = content.apply {

    val log = createLog()
    when(level) {
        Suspend -> runBlocking {
            printLog()
            saveLog()
        }
        Background -> {
            LoggingScope.launch {
                printLog()
            }
            LoggingScope.launch {
                saveLog()
            }
        }
    }

}


private fun createLog(): String = ""


suspend inline fun saveLog()
{

}

suspend inline fun printLog()
{

}
