package io.github.nishikigii.criterionkt.network.local

import io.github.nishikigii.criterionkt.network.Track

/**
 * track the downloading process.
 */
interface Local: Track
{

    /**
     * get download process tracker.
     */
    override fun track(): Downloader

}