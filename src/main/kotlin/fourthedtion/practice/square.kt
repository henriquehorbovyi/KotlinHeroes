package fourthedtion.practice

fun main() {
    repeat(readLine()?.toInt() ?: 0) {
        val firstPart = readLine()!!.split(" ").map{ it.toInt() }
        val secondPart = readLine()!!.split(" ").map { it.toInt() }
        val (a1, b1) = firstPart.sorted()
        val (a2, b2) = secondPart.sorted()
        if ((a1 + a2 == b1) && (b1 == b2)) println("Yes") else println("No")
    }
}

/*

1 3
2 3

 _ _ _    3
|
|
| _ _ _


    2x4
  _ _ _ _
 |       |
 |_ _ _ _|

    2x4
  _ _ _ _
 |       |
 |_ _ _ _|



  1x3
   _ _ _
  |_ _ _|


           _ _ _ _
          |        |
2x4       |_ _ _ _ |

           - - - -
          |       |
2x4       |_ _ _ _|






2 + 1 == 3

3x3













3 3 --> - - -
       |     |
       |     |
       |     |
        - - -


2 + 1 = 3 x 3

2 3
1 3  -> 1 + 2 == 3 ||

*/
