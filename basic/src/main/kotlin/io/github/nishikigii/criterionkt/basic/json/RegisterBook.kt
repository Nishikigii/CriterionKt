package io.github.nishikigii.criterionkt.basic.json

import io.github.nishikigii.criterionkt.basic.json.builtin.JsonArray
import io.github.nishikigii.criterionkt.basic.json.builtin.JsonEntry
import io.github.nishikigii.criterionkt.basic.json.builtin.JsonObject
import kotlin.Result.Companion
import kotlin.reflect.KClass

/**
 * enum of the implementations registered.
 * @see JsonElement
 * @param clazz implementation class.
 * @param root json string beginning root able
 */
enum class RegisterBook( val clazz: KClass<out JsonElement> )
{
    /**
     * json object like 「{"0": "value"}」.
     */
    Object(clazz = JsonObject::class),

    /**
     * json array like 「["parm1", "parm2", "parm3"]」.
     */
    Array(clazz = JsonArray::class),

    /**
     * json entry like 「"key": "value"」.
     */
    Entry(clazz = JsonEntry::class);


}