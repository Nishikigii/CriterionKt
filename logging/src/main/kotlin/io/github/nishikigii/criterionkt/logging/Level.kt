package io.github.nishikigii.criterionkt.logging

import io.github.nishikigii.criterionkt.logging.Level.Color.Normal
import io.github.nishikigii.criterionkt.logging.Level.Color.Red
import io.github.nishikigii.criterionkt.logging.Level.Color.Yellow

/**
 *
 */
enum class Level( val tag: String, val color: Color )
{
    Tips( tag = "Tips", color = Normal ),

    Information( tag = "Info", color = Normal ),

    Warning( tag = "Warn", color = Yellow ),

    Exception( tag = "Exp", color = Red ),

    Error( tag = "Err", color = Red );

    enum class Color( code: String )
    {
        Normal("NormalColorCode"),

        Red("RedColorCode"),

        Green("Green"),

        Yellow("Yellow"),

        Blue("Blue")
    }

}