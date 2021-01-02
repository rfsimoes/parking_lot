import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var nextInt = scanner.nextInt()
    while (nextInt != 1) {
        print("$nextInt ")
        if (nextInt % 2 == 0) {
            nextInt /= 2
        } else {
            nextInt = nextInt * 3 + 1
        }
    }
    print("$nextInt")
}