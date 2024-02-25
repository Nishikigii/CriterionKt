package io.github.nishikigii.criterionkt.basic.download

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