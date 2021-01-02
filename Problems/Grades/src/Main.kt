import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0
    var d: Int = 0
    repeat(n) {
        when (scanner.nextInt()) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }
    print("$d $c $b $a")

}