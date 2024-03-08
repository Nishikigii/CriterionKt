package io.github.nishikigii.criterionkt.network.remote

import io.github.nishikigii.criterionkt.network.Track

/**
 * track the uploading process
 */
interface Remote: Track
{
    /**
     * get upload process tracker.
     */
    override fun track(): Uploader

}