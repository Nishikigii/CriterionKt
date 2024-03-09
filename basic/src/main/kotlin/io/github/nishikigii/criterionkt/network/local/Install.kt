package io.github.nishikigii.criterionkt.network.local

import io.github.nishikigii.criterionkt.natives.downloadDir

/**
 * pull file from the internet about the implementor's instance.
 * it is similar to Pull but could be pulled to a specific local location.
 */
interface Install: Local
{
    /**
     * pull instance files from the internet to specific local location.
     * @see downloadDir for default download folder.
     * @param local installation directory.
     * @return downloading tasks manager.
     */
    fun install( local: String ): Downloader

}