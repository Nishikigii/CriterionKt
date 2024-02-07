package io.github.nishikigii.criterionkt.basic.java

import io.github.nishikigii.criterionkt.basic.java.Java.Type.Unknown
import io.github.nishikigii.criterionkt.basic.version.Version
import java.io.File
import java.io.FileNotFoundException
import java.util.Properties

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
        /**
         * create from the Java being used.
         */
        fun fromCurrent(): Java =  File(System.getProperty("java.home")).run {
            Java (
                home = this,
                version = Version(System.getProperty("java.version")),
                arch = System.getProperty("os.arch"),
                provider = System.getProperty("java.vendor"),
                executable =  File(this, "bin/java"),
                type = if (File(this, "release").exists()) Type.JDK else Type.JRE
            )
        }

        /**
         * create from javaHome directory.
         */
        fun fromHome( home: File ): Java
        {
            if ( !home.exists() )
                throw FileNotFoundException("The javaHome directory could not be found")
            val releaseFile = File("$home/release")
            if ( !releaseFile.exists() )
                throw FileNotFoundException("Cannot resolve release file inside the javaHome directory")
            val releaseProperty = Properties().apply { load( releaseFile.inputStream() ) }
            val version = Version(releaseProperty["JAVA_VERSION"] as String)
            val arch = releaseProperty["OS_ARCH"] as String
            val provider = releaseProperty["IMPLEMENTOR"] as String
            val executable = File(home, "bin/java")
            return Java(home, version, arch, provider, executable, Unknown)
        }

    }

    enum class Type
    {
        JRE, JDK, Unknown
    }
}
