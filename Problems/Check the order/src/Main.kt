import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var prev = scanner.nextInt()
    repeat(n - 1) {
        val i = scanner.nextInt()
        if (i < prev) {
            print("NO")
            return
        }
        prev = i

    }

    print("YES")
}