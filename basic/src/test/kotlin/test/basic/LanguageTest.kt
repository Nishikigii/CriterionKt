package test.basic

import io.github.nishikigii.criterionkt.basic.multilingual.Language.English
import io.github.nishikigii.criterionkt.basic.multilingual.Language.French
import io.github.nishikigii.criterionkt.basic.multilingual.Language.Japanese
import io.github.nishikigii.criterionkt.basic.multilingual.StringLa

fun main()
{
    val string = StringLa(English, "")
        .set(English, "ccc")
        .set(French, "aaa")

    println( string.read(Japanese) )
}