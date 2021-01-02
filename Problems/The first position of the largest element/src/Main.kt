import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var maxIndex = 1
    var currentIndex = 1

    while (scanner.hasNext()) {
        val i = scanner.nextInt()
        if (i > max) {
            max = i
            maxIndex = currentIndex
        }
        currentIndex++
    }

    print("$max $maxIndex")
}