package io.github.nishikigii.criterionkt.basic.system

/**
 * operating system type
 */
enum class SystemType
{
    // https://www.apple.com/macos
    MacOS,

    // https://www.microsoft.com/windows/
    Windows,

    // https://wikipedia.org/wiki/Linux
    Linux,

    // https://www.android.com/
    Android,

    // https://www.apple.com/ios/
    IOS,

    Others ;

    /**
     * if this enum matches anyone inside the provided list, execute provided action
     *
     * @param list matching list
     * @param action the task that will be executed if the match is successful
     */
    fun matches( vararg list: SystemType, action: ()->Unit ) = if ( this !in list ) false else { action(); true }


    /**
     * if this enum same to the type of current system, execute provided action
     *
     * @param action the action that will be executed if this enum is same to the type of current system
     */
    fun isCurrent( action: (SystemType)->Unit ) = if ( currentSystemType != this ) false else { action(this); true }

}

