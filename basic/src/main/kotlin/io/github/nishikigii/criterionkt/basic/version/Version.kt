package io.github.nishikigii.criterionkt.basic.version

import java.io.Serializable

/**
 * version info pack.
 */
data class Version (
    // 主版本号
    val major: UInt,

    // 次版本号
    val minor: UInt = 0u,

    // 修订版本号
    val patch: UInt = 0u,

    // 版本类型
    val annotation: Annotation? = null,

    // 构建序号
    val buildNumber: UInt? = null

): Serializable
{

    constructor( string: String ): this(string.replace("\"","").split('.'))

    constructor( list: List<String> ): this(list[0].toUInt(), list[1].toUInt(), list[2].toUInt())

    override fun toString() = StringBuilder()
        .append("$major.$minor.$patch")
        .apply { if (buildNumber != null) append("($buildNumber)") }
        .apply { if (annotation != null) append("-$annotation") }
        .toString()

}