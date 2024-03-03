package io.github.nishikigii.criterionkt.network.download

import kotlinx.coroutines.CoroutineScope

/**
 * pull file from the internet about the implementor's instance.
 */
interface Pull: Track
{

    /**
     * pull instance files from the internet.
     * @return downloading tasks manager.
     */
    fun pull(): CoroutineScope

}