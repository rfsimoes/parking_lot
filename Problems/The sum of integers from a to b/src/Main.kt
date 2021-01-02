import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var sum: Int = 0
    for (i in a..b)
        sum += i

    print(sum)
}