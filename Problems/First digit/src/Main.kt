import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val line = scanner.nextLine()
    for (char in line) {
        if (char.isDigit()) {
            print(char)
            break
        }
    }
}