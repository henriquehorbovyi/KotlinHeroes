package fourthedtion.practice

import java.util.Scanner

@ExperimentalStdlibApi
fun main() = with(Scanner(System.`in`)) {
    repeat(nextInt()) {
        val candies = ArrayDeque((0 until nextInt()).map { nextInt() })
        var turn = true

        var a = 0
        var b = 0
        var turns = 0
        var amount = 0

        while (candies.isNotEmpty()) {
            turns++
            var takenSum = 0

            if (turn) {
                do {
                    takenSum += candies.removeFirst()
                } while (candies.isNotEmpty() && takenSum <= amount)
                a += takenSum
            } else {
                do {
                    takenSum += candies.removeLast()
                } while (candies.isNotEmpty() && takenSum <= amount)
                b += takenSum
            }
            amount = takenSum
            turn = !turn
        }
        println("$turns $a $b ")
    }
}

/*
*  candies = [2, 5, 8, 6, 9, 3, 2, 6, 3]
*  amount = candies.first // 2
*  vez = false
*
*
*  #1
*  if (false)
*   eat(amount)
*   amount++
*   vez = !vez
*
*  #1
*  if (false)
*   eat(amount)
*   amount++
*   vez = !vez
*
*
*  candies = [5, 8, 6, 9, 3, 2, 6, 3]
*
*
*
* */





fun taskRunner(taskName: String) = with(listOf(1, 2, 3)) {

}