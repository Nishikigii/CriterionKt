package io.github.nishikigii.criterionkt.network.remote

import io.github.nishikigii.criterionkt.network.Internet

/**
 * track the uploading process
 */
interface Remote: Internet
{
    /**
     * get upload process tracker.
     */
    fun track(): Uploader

}