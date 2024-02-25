package test.basic

import io.github.nishikigii.criterionkt.basic.download.Download
import io.github.nishikigii.criterionkt.basic.download.Pull
import io.github.nishikigii.criterionkt.basic.download.Track
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
 *
 */
fun main()
{
    val instance = DownloadPack()
    val manager = instance.pull("./cache")
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
        }
    }

}