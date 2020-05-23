package thirdedition

fun main() {
    readLine()?.toInt()
    val numbers = readLine()
        ?.split(" ")
        ?.distinct()
        ?: listOf()

    println(numbers.size)
    numbers.forEach { print("$it ") }
}