import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    mapOf("amount" to 1000, "percent" to 5, "years" to 10)
    val parameter = scanner.nextLine()
    val value = scanner.nextInt()
    print(
        when (parameter) {
            "amount" -> compoundInterest(amount = value)
            "percent" -> compoundInterest(percent = value)
            "years" -> compoundInterest(years = value)
            else -> ""
        }
    )
}

fun compoundInterest(amount: Int = 1000, percent: Int = 5, years: Int = 10): Int {
    return (amount * (1 + percent / 100.0).pow(years)).toInt()
}
