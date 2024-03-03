package io.github.nishikigii.criterionkt.basic.java

import io.github.nishikigii.criterionkt.basic.launch.Parameter
import java.io.File
import java.util.jar.JarFile

/**
 * jvm startup arguments tags.
 * @param act [String] concrete representation in the resultant jvm startup command line
 */
sealed class Parameters( private val act: String? ): Parameter
{
    override fun toString() = act ?: "[Not available item:${this::class.simpleName}]"

    /**
     * main class tag.
     * @param clazz [String] main class value EXAMPLE: "com.example.Main"
     */
    class MainClass( private val clazz: String ): Parameters( clazz )
    {
        companion object
        {
            /**
             * regarded jar as a classpath item and resolve mainClass from its manifest.
             * it will do the same role as 「-jar」 tag to jvm startup arguments.
             * if you wanna usage it into arrays, then analyze it with spread operator.
             * EXAMPLE: val parm = arrayOf(*MainClass.fromJar("example.jar")).
             * @param jar [String] jar file path
             * @throws NullPointerException when resolve fields fail.
             * @return Array[ ClasspathItem, ItsMainClass ]
             */
            fun fromJar( jar: String ) = arrayOf(
                Dependency(jar),
                MainClass(JarFile(jar).manifest.mainAttributes.getValue("Main-Class"))
            )
        }

    }

    /**
     * classpath item.
     */
    class Dependency( private val jar: String ): Parameters(File(jar).path)

    /**
     * system property which starts with -D items.
     */
    class Property( private val key: String, private val value: String ): Parameters("-D$key=$value")

    // 用来测试的
    data object More: Parameters(null)

}
