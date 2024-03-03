package io.github.nishikigii.criterionkt.utils.file

import io.github.nishikigii.criterionkt.basic.result.Safety
import io.github.nishikigii.criterionkt.basic.result.safely
import io.github.nishikigii.criterionkt.basic.result.unsafe
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.io.File

/**
 * create file with making sure parents folders exist.
 * @return whether create successfully.
 */
suspend fun File.sure(): Safety<File> = mutex.withLock {
    val parent = if ( parentFile.exists() ) true else parentFile.mkdirs()
    val self = if ( exists() ) true else createNewFile()
    if ( parent and self ) safely(this) else unsafe(Throwable("fail to create: ${this.path}"))
}

/**
 * made sure that the sure() won't run parallel if too many coroutines call sure() at the sametime
 */
private val mutex = Mutex()

