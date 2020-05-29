package fourthedtion.practice

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    for (index in 0 until nextInt()) {
        val n = nextInt()
        if (n <= 3) {
            println(-1)
            continue
        }
        val m = n / 2 * 2
        val list = mutableListOf<Int>()
        for (i in m downTo 2 step 2) {
            if (i != 4) {
                list.add(i)
            }
        }
        list.add(4)
        for (i in 1..n step 2) {
            list.add(i)
        }
        println(list.joinToString(" "))
    }
}
