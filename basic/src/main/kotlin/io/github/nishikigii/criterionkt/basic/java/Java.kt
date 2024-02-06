package io.github.nishikigii.criterionkt.basic.java

import io.github.nishikigii.criterionkt.basic.version.Version
import java.io.File

/**
 * java information package.
 */
data class Java(

    val home: File,

    val version: Version,

    val arch: String ,

    val provider: String ,

    val executable: File,

    val type: Type
)
{
    companion object
    {
        // 获取当前正在使用的 Java
        fun getCurrent(): Java
        {
            val javaHome = File(System.getProperty("java.home"))
            val version = Version(System.getProperty("java.version"))
            val arch = System.getProperty("os.arch")
            val provider = System.getProperty("java.vendor")
            val executable = File(File(javaHome, "bin"), "java")
            val type = if (File(javaHome, "lib").exists()) Type.JDK else Type.JRE
            return Java(javaHome, version, arch, provider, executable, type)
        }
    }

    enum class Type
    {
        JRE, JDK, Undefined
    }
}
