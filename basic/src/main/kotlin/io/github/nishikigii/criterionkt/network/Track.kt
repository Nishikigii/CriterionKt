package io.github.nishikigii.criterionkt.network

import kotlinx.coroutines.CoroutineScope

/**
 * track information exchanging processes of internet remote and local.
 */
interface Track: Internet
{

    /**
     * get process tracker.
     */
    fun track(): CoroutineScope

}