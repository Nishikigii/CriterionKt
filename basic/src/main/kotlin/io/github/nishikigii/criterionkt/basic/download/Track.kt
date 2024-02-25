package io.github.nishikigii.criterionkt.basic.download

import kotlinx.coroutines.CoroutineScope

/**
 *
 */
interface Track
{
    fun downloadTrack(): CoroutineScope

}