package test.basic

import io.github.nishikigii.criterionkt.basic.launch.Parameterized
import io.github.nishikigii.criterionkt.basic.launch.argument.Parm
import io.github.nishikigii.criterionkt.basic.launch.launcher.ParmLauncher

/**
 *
 */
fun main()
{
    val target = LaunchTest()
    val launcher = target.launcher()
    val process = launcher.process()
}

class LaunchTest: Parameterized<String>
{
    override fun launcher( vararg parm: Pair<Parm<String>, String> ): ParmLauncher<String>
    {
        TODO("Not yet implemented")
    }

    override fun exportParm(): String
    {
        TODO("Not yet implemented")
    }

}