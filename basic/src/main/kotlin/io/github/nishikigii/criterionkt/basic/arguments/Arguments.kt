package io.github.nishikigii.criterionkt.basic.arguments

/**
 * arguments.
 */
fun arguments( content: ArgsScope.()->Unit ): Argument
{
    val result = ArrayList<String>()
    val scope = object: ArgsScope {
        override fun getEditable() = result
    }
    scope.content()
    return Argument(arrayListOf(), arrayListOf(), "", arrayListOf())
}


/**
 *
 */
interface ArgsScope
{
    fun getEditable(): ArrayList<String>

}