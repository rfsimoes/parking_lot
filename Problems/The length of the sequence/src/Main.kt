import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var lastRead: Int
    var numsRead = -1
    do {
        lastRead = scanner.nextInt()
        numsRead++
    } while (lastRead != 0)

    print(numsRead)
}