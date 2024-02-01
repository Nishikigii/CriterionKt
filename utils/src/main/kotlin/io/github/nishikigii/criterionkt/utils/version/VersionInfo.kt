package io.github.nishikigii.criterionkt.utils.version

import java.io.Serializable

// 版本号信息
data class VersionInfo (
    // 主版本号
    val major: UInt,

    // 次版本号
    val minor: UInt = 0u,

    // 修订版本号
    val patch: UInt = 0u,

    // 版本类型
    val annotation: VersionAnnotation? = null,

    // 构建序号
    val buildNumber: UInt? = null

): Serializable
{

    override fun toString() = StringBuilder()
        .append("$major.$minor.$patch")
        .apply { if (buildNumber != null) append("($buildNumber)") }
        .apply { if (annotation != null) append("-$annotation") }
        .toString()

}