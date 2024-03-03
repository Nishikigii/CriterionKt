package io.github.nishikigii.criterionkt.basic.result

/**
 * safe value.
 */
fun <V> safely( value: V ) = object: Safety<V>
{
    override fun excepted(action: (Throwable) -> V): V = value
}

/**
 * unsafe value.
 */
fun <V> unsafe( reason: Throwable ) = object: Safety<V>
{
    override fun excepted( action: (Throwable) -> V ) = action(reason)
}


fun <V> unstable( cause: Throwable ) = object: Safety<V>
{
    override fun excepted(action: (Throwable) -> V): V =
        throw Throwable("the value safety is unstable", cause).apply {
            action(this)
        }
}