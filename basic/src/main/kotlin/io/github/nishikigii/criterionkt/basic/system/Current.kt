package io.github.nishikigii.criterionkt.basic.system

val currentOsName = System.getProperty("os.name").lowercase()

val currentSystemType = when {
    currentOsName.contains("mac") -> SystemType.MacOS
    currentOsName.contains("win") -> SystemType.Windows
    currentOsName.contains("nix") || currentOsName.contains("nux") || currentOsName.contains("aix") -> SystemType.Linux
    currentOsName.contains("android") -> SystemType.Android
    currentOsName.contains("ios") -> SystemType.IOS
    else -> SystemType.Others
}

