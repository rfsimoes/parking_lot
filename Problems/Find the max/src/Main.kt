import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numElements = scanner.nextInt()
    var max = Integer.MIN_VALUE
    var maxIndex = 0
    for (i in 0 until numElements) {
        val nextInt = scanner.nextInt()
        if (nextInt > max) {
            max = nextInt
            maxIndex = i
        }
    }
    print(maxIndex)
}