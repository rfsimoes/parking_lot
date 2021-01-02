import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val nextInt = scanner.nextInt()
    if (nextInt < 10 && nextInt > 0)
        print(true)
    else
        print(false)

}