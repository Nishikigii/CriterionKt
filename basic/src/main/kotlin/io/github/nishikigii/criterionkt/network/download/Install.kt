package io.github.nishikigii.criterionkt.network.download

import kotlinx.coroutines.CoroutineScope

/**
 * pull file from the internet about the implementor's instance.
 * it is similar to Pull but could be pulled to a specific local location.
 */
interface Install: Track
{
    /**
     * pull instance files from the internet to specific local location.
     * @param local installation directory.
     * @return downloading tasks manager.
     */
    fun install( local: String ): CoroutineScope

}