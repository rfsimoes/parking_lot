import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextLine()
    val n = scanner.nextInt()
    val nstr = input[n - 1]

    println("Symbol # $n of the string \"$input\" is '$nstr'")
}
