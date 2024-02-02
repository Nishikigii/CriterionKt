package io.github.nishikigii.criterionkt.basic.multilingual

import io.github.nishikigii.criterionkt.json.JsonArray
import java.io.File

/**
 * multilingual strings list.
 * it is a heavy object that You should not create or destroy it too often.
 * just two or four is enough for one program
 */
class StringsList private constructor( val content: Array<StringLa> )
{
    companion object
    {
        /**
         * create a new StringsList from json.
         *
         * @param config example: [{"English":"hello","Chinese":"你好"},{"Japanese":"かわい"}]
         */
        fun fromJson( config: JsonArray ): StringsList
        {
            TODO()
        }

        /**
         * create a new StringsList from config file.
         * Q:how can I get a config file? A:call the function exportJson() and write it into a file
         *
         * @param config config file
         */
        fun fromConfig( config: File ): StringsList
        {
            TODO()
        }


        fun create( definition: BuildScope.()->Unit ): StringsList
        {
            val scope = ""
            TODO()
        }

        /**
         * export content as jsonArray config
         */
        fun StringsList.exportJson(): JsonArray
        {
            TODO()
        }

        interface BuildScope
        {
            val content: List<StringLa>

            fun field(  )
        }

    }

}