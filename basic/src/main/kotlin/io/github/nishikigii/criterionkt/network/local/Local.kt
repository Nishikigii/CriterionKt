package io.github.nishikigii.criterionkt.network.local

import io.github.nishikigii.criterionkt.network.Internet

/**
 * track the downloading process.
 */
interface Local: Internet
{

    /**
     * get download process tracker.
     */
    fun track(): Downloader

}