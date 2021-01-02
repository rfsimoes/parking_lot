import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val x = mutableSetOf<Int>()
    val y = mutableSetOf<Int>()
    var resultX = ""
    var resultY = ""

    for (i in 0..5) {
        if (i % 2 == 0) {
            x.add(input.nextInt())
        } else {
            y.add(input.nextInt())
        }
    }

    for (i in 1..5) {
        if (i !in x) {
            resultX += "$i "
        }

        if (i !in y) {
            resultY += "$i "
        }
    }

    print("${resultX.trim()}\n${resultY.trim()}")
}