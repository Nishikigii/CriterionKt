package test.basic

import io.github.nishikigii.criterionkt.network.download.Pull
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.apache.hc.client5.http.classic.methods.HttpGet
import org.apache.hc.client5.http.impl.classic.HttpClients
import java.io.File

/**
 *
 */
fun main()
{
    val url = "https://piston-meta.mojang.com/mc/game/version_manifest.json"
    val file = "/Users/andei_buite/Downloads/pull/file"
    downloadFile(url, file)
}

fun downloadFile(url: String, file: String)
{
    val saving = File(file).apply { parentFile.mkdirs() }.apply { createNewFile() }
    HttpClients.createMinimal().apply {
        execute(HttpGet(url)){ response ->
            response.entity.content.use{
                it.copyTo(saving.outputStream())
            }
        }
    }.close()
}


class DownloadPack: Pull
{
    private val downloader = object: CoroutineScope
    {
        override val coroutineContext = Job() + Dispatchers.IO
    }

    override fun downloadTrack() = downloader

    override fun pull( local: String ) = downloadTrack().apply {
        launch {
            println("downloading")
            delay(5000)
        }
        launch {
            println("downloading2")
            delay(5000)
        }
    }

}