import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val string1 = scanner.nextLine()
    val operation = scanner.nextLine()
    val string2 = scanner.nextLine()
    when (operation) {
        "equals" -> print(string1 == string2)
        "plus" -> print(string1 + string2)
        "endsWith" -> print(string1.endsWith(string2))
        else -> print("Unknown operation")
    }
}