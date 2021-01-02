import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val nextInt = scanner.nextInt()
    var max: Int = 0
    repeat(nextInt) {
        val i = scanner.nextInt()
        if (i % 4 == 0 && i > max) max = i
    }
    print(max)
}