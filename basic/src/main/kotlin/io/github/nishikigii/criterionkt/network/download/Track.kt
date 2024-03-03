package io.github.nishikigii.criterionkt.network.download

import kotlinx.coroutines.CoroutineScope

/**
 *
 */
interface Track
{
    fun downloadTrack(): CoroutineScope

}