package thirdedition

import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        var xCounter = 0
        var removedCounter = 0
        readLine()?.forEach {
            xCounter = if (it == 'x') xCounter + 1 else 0
            if (xCounter >= 3) removedCounter++
        }
        println(removedCounter)
    }
    println(time)
}