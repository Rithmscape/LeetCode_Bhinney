import kotlin.math.pow
import kotlin.math.sqrt

class Solution {
    fun solution(k: Int, d: Int): Long {
        var answer: Long = 0

        for (i in 0 .. d step k) {
            val max = sqrt(d.toDouble().pow(2) - i.toDouble().pow(2)).toLong()
            answer += max / k + 1
        }

        return answer
    }
}