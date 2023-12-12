import kotlin.math.pow

class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
         val one = a + b + c
        val two = (a.toDouble().pow(2) + b.toDouble().pow(2) + c.toDouble().pow(2)).toInt()
        val three = (a.toDouble().pow(3) + b.toDouble().pow(3) + c.toDouble().pow(3)).toInt()

        val set = intArrayOf(a, b, c).toSet();

        return when(set.size) {
            3 -> one
            2 -> one * two
            1 -> one * two * three
            else -> -1
        }
    }
}