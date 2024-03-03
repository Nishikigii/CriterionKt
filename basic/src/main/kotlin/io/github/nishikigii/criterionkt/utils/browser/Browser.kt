package io.github.nishikigii.criterionkt.utils.browser

import java.awt.Desktop
import java.net.URI

object Browser
{
    fun openURI( uri: URI )
    {
        if ( !Desktop.isDesktopSupported() )
            throw UnsupportedOperationException("the system are not support desktop operation")
        val desktop = Desktop.getDesktop() ?:
            throw UnsupportedOperationException("the system are not support desktop operation")
        if ( !desktop.isSupported( Desktop.Action.BROWSE ) )
            throw UnsupportedOperationException("could not get instance of system default browser")
        desktop.browse(uri)
    }

}