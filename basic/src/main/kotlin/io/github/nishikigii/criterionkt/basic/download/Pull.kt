package io.github.nishikigii.criterionkt.basic.download

import kotlinx.coroutines.CoroutineScope

/**
 * pull file from the internet about the implementor's instance.
 */
interface Pull: Track
{

    /**
     * start pulling.
     * @param local pulled files saving directory.
     * @return pulling tasks manager.
     */
    fun pull( local: String ): CoroutineScope

}