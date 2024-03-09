package io.github.nishikigii.criterionkt.network.local

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

/**
 *
 */
abstract class Downloader: CoroutineScope by CoroutineScope(Dispatchers.IO)
{

    /**
     * real-time downloading speed: kb/s.
     * @return speed: kb/s.
     */
    abstract fun speed(): Long

    /**
     * task files total size: kb.
     * @return size: kb.
     */
    abstract fun total(): Long

    /**
     * finished task files size: kb.
     * @return size: kb.
     */
    abstract fun done(): Long

    /**
     * rest task files size: kb.
     * @return size: kb.
     */
    fun rest(): Long = total()-done()

}