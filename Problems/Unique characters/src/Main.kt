import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val line = scanner.nextLine()
    val counter = emptyMap<Char, Int>().toMutableMap()
    for (char in line) {
        counter[char] = counter.getOrDefault(char, 0) + 1
    }

    val count = counter.filter { (_, value) -> value == 1 }.count()
    print(count)
}