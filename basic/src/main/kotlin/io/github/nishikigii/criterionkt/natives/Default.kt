package io.github.nishikigii.criterionkt.natives

import io.github.nishikigii.criterionkt.utils.system.SystemType.Android
import io.github.nishikigii.criterionkt.utils.system.SystemType.IOS
import io.github.nishikigii.criterionkt.utils.system.SystemType.Linux
import io.github.nishikigii.criterionkt.utils.system.SystemType.MacOS
import io.github.nishikigii.criterionkt.utils.system.SystemType.Others
import io.github.nishikigii.criterionkt.utils.system.SystemType.Windows
import io.github.nishikigii.criterionkt.utils.system.systemType

/**
 * current user home dir.
 */
val home: String = System.getProperty("user.home")


/**
 * files download folder.
 */
var downloadDir: String = when (systemType)
{
    MacOS, Windows, Linux -> "$home/downloads"
    Android, IOS -> TODO()
    Others -> TODO()
}