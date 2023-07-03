import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import model.FunkwhaleInfo
import parse.FunkwhaleParse

fun main(args: Array<String>) = Funkwhale().main(args)

class Funkwhale : CliktCommand() {
    val url by argument()
    val username: String by option("-u", "--username", help = "your username").default("admin")
    val password: String by option("-p", "--password", help = "your password").default("password")
    override fun run() {
        funkwhale(url, username, password)
    }
}

fun funkwhale(host: String, username: String, password: String) {
    val funkwhaleParse = FunkwhaleParse(
        FunkwhaleInfo(
            url = host,
            username = username,
            password = password
        )
    )
    funkwhaleParse.download()
}
