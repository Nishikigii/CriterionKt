package io.github.nishikigii.criterionkt.network.remote

import java.net.URI

/**
 * update the remote information saved on a server.
 */
interface Update
{
    /**
     * update the remote information saved on a server.
     * @return success and a response if successfully received by the server, otherwise returns fail.
     */
    fun update( server: URI ): Result<String>

}