package io.github.nishikigii.criterionkt.basic.java.argument.element.option

/**
 * types of option part of jvm startup parameters.
 */
enum class Option( val format: String, vararg replace: String )
{
    // 系统属性
    Property("""-D"<key>"="<value>"""", "<key>", "<value>"),

    // 最大堆内存大小
    MaxMemory("-Xmx<memory>m", "<memory>"),

    // 初始堆内存大小
    MinMemory("-Xms<memory>m", "<memory>"),

    // 初始RAM内存占比
    InitialRAMPercentage("-XX:InitialRAMPercentage=<percent>"),

    // 线程堆栈大小
    ThreadStackSize("-Xss<size>", "<size>"),

    // 最大永久代大小
    MaxPermSize("-XX:MaxPermSize=<size>", "<size>"),

    // 最大元空间大小
    MaxMetaspaceSize("-XX:MaxMetaspaceSize=<size>", "<size>"),

    // 新生代大小
    NewSize("-XX:NewSize=<size>", "<size>"),

    // 最大新生代大小
    MaxNewSize("-XX:MaxNewSize=<size>", "<size>"),

    // 永久代大小
    PermSize("-XX:PermSize=<size>", "<size>"),

    // 最大堆内存大小
    MaxHeapSize("-XX:MaxHeapSize=<size>", "<size>"),

    // 最小RAM内存占比
    MinRAMPercentage("-XX:MinRAMPercentage=<percent>", "<percent>"),

    // 并行垃圾回收线程数
    ParallelGCThreads("-XX:ParallelGCThreads=<num>", "<num>"),

    // 并发垃圾回收线程数
    ConcGCThreads("-XX:ConcGCThreads=<num>", "<num>"),

    // 最大垃圾回收停顿时间
    MaxGCPauseMillis("-XX:MaxGCPauseMillis=<time>", "<time>");

    val replace = replace.toMutableList()
}