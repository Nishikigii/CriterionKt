package io.github.nishikigii.criterionkt.network.local

/**
 * pull file from the internet about the implementor's instance.
 */
interface Pull: Local
{

    /**
     * pull instance files from the internet.
     * @return downloading tasks manager.
     */
    fun pull(): Downloader

}