package io.github.nishikigii.criterionkt.network.download

import kotlinx.coroutines.launch

/**
 *
 */
interface Download: Track
{
    fun download( task:()->Unit ) = downloadTrack().apply {
        launch { task() }
    }

}