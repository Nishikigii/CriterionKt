package io.github.nishikigii.criterionkt.basic.multilingual

import io.github.nishikigii.criterionkt.basic.multilingual.Language.English
import java.io.Serializable
import kotlin.collections.Map.Entry

// multilingual string
class StringLa private constructor(): Map<Language, String>, Serializable
{

    override val keys = Language.entries.toSet()

    override val size = Language.entries.size

    override val entries: Set<Entry<Language, String>>
        get() {
            val result = HashSet<Entry<Language,String>>()
            this.forEach {
                result.add(it)
            }
            return result
        }

    override val values: Collection<String>
        get() {
            val result = ArrayList<String>()
            this.forEach {
                result.add(it.value)
            }
            return result
        }

    override fun isEmpty() = false

    override fun get(key: Language): String?
    {
        TODO("Not yet implemented")
    }

    override fun containsValue(value: String): Boolean
    {
        TODO("Not yet implemented")
    }

    override fun containsKey(key: Language): Boolean
    {
        TODO("Not yet implemented")
    }

}