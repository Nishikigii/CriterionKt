package io.github.nishikigii.criterionkt.network.okhttp

import okhttp3.ResponseBody
import okio.Buffer
import okio.BufferedSource
import okio.ForwardingSource
import okio.Source
import okio.buffer

class ProgressResponseBody (

    private val responseBody: ResponseBody,

    private val progressListener: (bytesRead: Long, contentLength: Long) -> Unit

) : ResponseBody()
{

    private var bufferedSource: BufferedSource? = null

    override fun contentType() = responseBody.contentType()

    override fun contentLength() = responseBody.contentLength()


    override fun source(): BufferedSource
    {
        if (bufferedSource == null)
        {
            bufferedSource = source(responseBody.source()).buffer()
        }
        return bufferedSource!!
    }

    private fun source(source: Source) = object: ForwardingSource(source)
    {
        var totalBytesRead = 0L

        override fun read(sink: Buffer, byteCount: Long): Long
        {
            val bytesRead = super.read(sink, byteCount)
            totalBytesRead += if (bytesRead != -1L) bytesRead else 0
            progressListener(totalBytesRead, responseBody.contentLength())
            return bytesRead
        }
    }

}