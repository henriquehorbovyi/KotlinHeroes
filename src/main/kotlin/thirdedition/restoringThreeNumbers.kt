package thirdedition
import kotlin.math.abs

fun main() {
    val (w, x, y, z) = readLine()
        ?.split(" ")
        ?.map { it.toInt() }
        ?.sorted()
        ?: listOf()

    val a: Int = abs(z - (x + y))
    val b: Int = abs(z - (w + y))
    val c: Int = abs(z - (a + b))

    print("$a $b $c")
}