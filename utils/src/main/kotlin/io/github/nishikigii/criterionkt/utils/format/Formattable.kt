package io.github.nishikigii.criterionkt.utils.format

// 可被格式化
interface Formattable
{
    // 以指定格式将该对象格式化
    fun format( vararg format: Pair<Regex, String> ): Formattable
}