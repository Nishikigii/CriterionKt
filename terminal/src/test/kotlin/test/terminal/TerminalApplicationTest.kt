package test.terminal

import io.github.nishikigii.criterionkt.terminal.application.terminalApplication
import io.github.nishikigii.criterionkt.terminal.command.Response
import io.github.nishikigii.criterionkt.terminal.command.command

fun main() = terminalApplication {

    command("test") {
        Response()
    }

    Thread.sleep(5000)
}