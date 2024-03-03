package io.github.nishikigii.criterionkt.network.download

import kotlinx.coroutines.CoroutineScope

/**
 * be able to track the downloading process.
 */
interface Track
{

    fun downloadTrack(): CoroutineScope

}