// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main(args: Array<String>) {
    // implement your code
    val height = readLine()?.toInt()
    val length1 = readLine()?.toInt()
    val length2 = readLine()?.toInt()
    val width = readLine()?.toInt()
    val box1 = Box(height = height!!, length = length1!!, width = width!!)
    val box2 = box1.copy(length = length2!!)
    println(box1)
    println(box2)
}