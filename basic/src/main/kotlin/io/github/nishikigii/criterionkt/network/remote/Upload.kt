package io.github.nishikigii.criterionkt.network.remote

/**
 * upload instance information to remote.
 */
interface Upload
{
    /**
     * upload instance information to remote.
     * @return success and a response if successfully received by the server, otherwise returns fail.
     */
    fun upload(): Result<String>
}