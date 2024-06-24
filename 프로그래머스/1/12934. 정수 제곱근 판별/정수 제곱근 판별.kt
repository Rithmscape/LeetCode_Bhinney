import kotlin.math.pow
import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        val sqrt = sqrt(n.toDouble()).toLong()

        return if (n == sqrt.toDouble().pow(2.0).toLong()) (sqrt + 1).toDouble().pow(2.0).toLong() else -1
    }

}