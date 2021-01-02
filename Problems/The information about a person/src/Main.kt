import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val split = scanner.nextLine().split(" ")
    val firstName = split[0]
    val lastName = split[1]
    val age = split[2]
    print("${firstName[0]}. $lastName, $age years old")
}