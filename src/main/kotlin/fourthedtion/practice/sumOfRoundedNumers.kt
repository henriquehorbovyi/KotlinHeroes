package fourthedtion.practice

import kotlin.system.measureNanoTime

fun main() {
    val meuTime = measureNanoTime {
        meuCase("5009")
    }

    val timeDele = measureNanoTime {
        case2(5009)
    }

    val bestTime = measureNanoTime {
        best("5009")
    }
    println("-------------------------")
    println("$meuTime x $timeDele x $bestTime")
}



fun meuCase(x: String) {
    var answer = ""
    var counter = 0

    repeat(1) {
        val typedNumber = x//readLine()!!
        (0..typedNumber.lastIndex).forEach { index ->
            val currentLetter = typedNumber[index]
            val replaced = typedNumber
                .substring((index + 1)..typedNumber.lastIndex)
                .replace("\\d".toRegex(), "0")
            if (currentLetter != '0') {
                answer += "$currentLetter$replaced "
                counter++
            }

        }
        println(counter)
        println(answer)
        answer = ""
        counter = 0
    }
}


fun case2(x: Int = 0){
    var tc = 1//readLine()!!.toInt()
    while(tc-- > 0){
        var n = x//readLine()!!.toInt()
        var a = IntArray(10)
        var ptr = 0
        var t = n
        while(t > 0){
            var d = t % 10
            a[ptr++] = d
            t /= 10
        }

        var ans = 0
        for(i in 0..ptr- 1){
            if (a[i] > 0){
                ans++
            }
        }

        println(ans)
        for(i in 0..ptr - 1){
            if (a[i] != 0){
                var hto = a[i]
                for(j in 0..i-1){
                    hto = hto * 10;
                }
                print(hto)
                print(' ')
            }
        }

        println("")
    }
}

fun best(x: String) {
    for (c in 1..1) {
        val n = readLine()!!
        val answer = mutableListOf<String>()
        for (index in 0 until n.length) {
            if (n[n.length - index - 1] != '0') {
                answer.add(n[n.length - index - 1] + "0".repeat(index))
            }
        }
        println(answer.size)
        println(answer.joinToString(" "))
    }
}