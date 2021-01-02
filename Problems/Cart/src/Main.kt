fun main() {
    val productType = readLine()!!
    val price = readLine()!!.toInt()
    val product = when (productType) {
        "headphones" -> Headphones(price)
        "smartphone" -> Smartphone(price)
        "tv" -> TV(price)
        "laptop" -> Laptop(price)
        else -> Product(price)
    }
    println(totalPrice(product))
}

fun totalPrice(product: Product): Int {
    return product.totalPrice()
}

open class Product(private val price: Int, private val tax: Int = 0) {
    open fun totalPrice(): Int {
        return price + price * tax / 100
    }
}

class Headphones(price: Int, tax: Int = 11) : Product(price, tax)

class Smartphone(price: Int, tax: Int = 15) : Product(price, tax)

class TV(price: Int, tax: Int = 17) : Product(price, tax)

class Laptop(price: Int, tax: Int = 19) : Product(price, tax)