package io.github.nishikigii.criterionkt.network.okhttp

import okhttp3.Interceptor
import okhttp3.Response

class DownloadSpeedInterceptor : Interceptor
{
    /**
     * task - speed
     */
    private val speedMap = mutableMapOf<String, Long>()

    override fun intercept(chain: Interceptor.Chain): Response
    {
        val request = chain.request()
        val response = chain.proceed(request)

        // calculate the download speeds
        val startTime = System.nanoTime()
        return response.newBuilder()
            .body(ProgressResponseBody(response.body!!) { bytesRead, _ ->
                val duration = System.nanoTime() - startTime
                val speed = bytesRead * 1.0 / duration * 1.0e9
                speedMap[request.url.toString()] = speed.toLong()
            })
            .build()
    }

    /**
     * get specific task speed
     */
    fun specific(url: String) = speedMap[url] ?: 0

    /**
     * get all tasks' speed
     */
    fun all() = speedMap

    /**
     * get the sum of all task speeds
     */
    fun total(): Long
    {
        var speed = 0L
        speedMap.forEach {
            speed += it.value
        }
        return speed
    }

}