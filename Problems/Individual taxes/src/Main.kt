import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val numCompanies = scanner.nextInt()
    val income = IntArray(numCompanies)
    for (i in 0 until numCompanies) {
        income[i] = scanner.nextInt()
    }
    val taxes = IntArray(numCompanies)
    for (i in 0 until numCompanies) {
        taxes[i] = scanner.nextInt()
    }
    var mostTaxes = Double.MIN_VALUE
    var mostTaxesIndex = 0
    for (i in 0 until numCompanies) {
        val tax = income[i] * taxes[i] / 100.0
        if (tax > mostTaxes) {
            mostTaxes = tax
            mostTaxesIndex = i + 1
        }
    }
    print(mostTaxesIndex)
}