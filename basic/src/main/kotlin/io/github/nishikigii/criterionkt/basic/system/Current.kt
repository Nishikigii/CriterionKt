package io.github.nishikigii.criterionkt.basic.system

private val os = System.getProperty("os.name").lowercase()

/**
 * the type of current system
 */
val systemType = when {
    os.contains("mac") -> SystemType.MacOS
    os.contains("win") -> SystemType.Windows
    os.contains("nix") || os.contains("nux") || os.contains("aix") -> SystemType.Linux
    os.contains("android") -> SystemType.Android
    os.contains("ios") -> SystemType.IOS
    else -> SystemType.Others
}

