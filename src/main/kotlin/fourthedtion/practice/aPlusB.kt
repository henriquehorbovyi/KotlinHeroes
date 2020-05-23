package fourthedtion.practice

fun main() {
    val timesToRead = readLine()?.toInt() ?: 0
    val sums = mutableListOf<Int>()
    repeat(timesToRead) {
        readLine()?.split(" ")?.let { (a, b) -> sums.add(a.toInt() + b.toInt()) }
    }
    sums.forEach(::println)
}
