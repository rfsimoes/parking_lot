import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val arraySize = scanner.nextInt()
    val array: IntArray = IntArray(arraySize)
    for (i in 0 until arraySize) {
        array[i] = scanner.nextInt()
    }
    var rightShifts = scanner.nextInt()
    rightShifts %= arraySize
    val arrayRotated: IntArray = IntArray(arraySize)
    for (i in 0 until arraySize) {
        arrayRotated[i] = array[(arraySize - rightShifts + i) % arraySize]
    }

    print(arrayRotated.joinToString(separator = " "))

}