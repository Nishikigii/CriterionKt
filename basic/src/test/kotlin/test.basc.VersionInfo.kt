import io.github.nishikigii.criterionkt.utils.version.VersionAnnotation.Beta
import io.github.nishikigii.criterionkt.utils.version.VersionInfo

fun main()
{
    val version = VersionInfo(1u,2u,3u, annotation = Beta)

    println( version )
}