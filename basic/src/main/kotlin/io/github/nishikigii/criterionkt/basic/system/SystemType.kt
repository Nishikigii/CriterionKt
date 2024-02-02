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

    // 若此 Type 是指定 Type 之一则执行任务
    fun matches( vararg types: SystemType, task: ()->Unit ) = if ( this !in types ) false else { task(); true }


    // 若此 Type 是当前系统 Type 则执行任务
    fun isCurrent( task: (SystemType)->Unit ) = if ( currentSystemType != this ) false else { task(this); true }

}

