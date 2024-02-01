package io.github.nishikigii.criterionkt.utils.version

// 版本类型
enum class VersionAnnotation( val info: String )
{
    // 内测版本, 不对外开放, 运行稳定性不确定
    Alpha("closed to the public, uncertain stability"),

    // 公测版本, 对外开放, 运行稳定性不确定
    Beta("opened to the public, uncertain stability"),

    // 正式版, 对外正式发布, 运行稳定性良好
    Release("opened to the public, well stability"),

    // 快照版, 类似于 Beta 版本
    @Deprecated(replaceWith = ReplaceWith("Beta"), message = "This designation will be discarded")
    Snapshot(Beta.info)
}