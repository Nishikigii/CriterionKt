package io.github.nishikigii.criterionkt.basic.result


/**
 * possibly invalid value.
 */
interface Safety<V>
{

    /**
     * take stored value out and run action if the value is not safe.
     */
    fun excepted( action: (Throwable)->V ): V

}