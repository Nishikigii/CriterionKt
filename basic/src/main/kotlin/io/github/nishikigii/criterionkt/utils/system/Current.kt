package io.github.nishikigii.criterionkt.utils.system

import io.github.nishikigii.criterionkt.utils.system.SystemType.Android
import io.github.nishikigii.criterionkt.utils.system.SystemType.IOS
import io.github.nishikigii.criterionkt.utils.system.SystemType.Linux
import io.github.nishikigii.criterionkt.utils.system.SystemType.MacOS
import io.github.nishikigii.criterionkt.utils.system.SystemType.Others
import io.github.nishikigii.criterionkt.utils.system.SystemType.Windows

private val os = System.getProperty("os.name").lowercase()

/**
 * the type of current system
 */
val systemType = when {
    os.contains("mac") -> MacOS
    os.contains("win") -> Windows
    os.contains("nix") || os.contains("nux") || os.contains("aix") -> Linux
    os.contains("android") -> Android
    os.contains("ios") -> IOS
    else -> Others
}

