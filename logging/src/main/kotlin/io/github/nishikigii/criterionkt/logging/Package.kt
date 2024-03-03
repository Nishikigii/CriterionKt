package io.github.nishikigii.criterionkt.logging

import io.github.nishikigii.criterionkt.logging.Package.Block.Background
import io.github.nishikigii.criterionkt.logging.Package.Block.Suspend
import io.github.nishikigii.criterionkt.logging.Package.Color.Blue
import io.github.nishikigii.criterionkt.logging.Package.Color.Green
import io.github.nishikigii.criterionkt.logging.Package.Color.Normal
import io.github.nishikigii.criterionkt.logging.Package.Color.Red
import io.github.nishikigii.criterionkt.logging.Package.Color.Yellow

/**
 *
 */
enum class Package( val tag: String, val color: Color, val level: Block = Suspend )
{
    Tips( tag = "Detail", color = Blue, level = Background ),

    Words( tag = "Words", color = Yellow, level = Background ),

    None( tag = "None", color = Normal ),

    Trend( tag = "Pre-Exp!", color = Green ),

    Exception( tag = "Exp", color = Yellow ),

    Panic( tag = "Panic", color = Red );

    enum class Color( code: String )
    {
        Normal("normal"),

        Red("red"),

        Green("green"),

        Yellow("yellow"),

        Blue("blue")
    }

    enum class Block
    {
        // blockly.
        Suspend,

        // nonblocking.
        Background;

        fun whether( action: ()->Unit ) = when(this)
        {
            Background-> { action() }
            else-> {}
        }

    }
}