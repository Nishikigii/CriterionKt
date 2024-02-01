package io.github.nishikigii.criterionkt.basic.system

// 系统类型
enum class SystemType
{
    MacOS,

    Windows,

    Linux,

    Android,

    IOS,

    Others ;


    // 判断此 Type 是否在某范围内
    fun matches( vararg types: SystemType ) = this in types

    // 次 Type 如果是当前类型则执行任务
    fun isCurrent( task: (SystemType)->Unit ) = if ( currentSystemType == this ) task(currentSystemType) else Unit

}