import kotlin.math.pow

class Solution {
    fun solution(n: Int): Int = if (n % 2 == 0) (2 .. n step 2).map { it.toDouble().pow(2.0) }.sum().toInt()else (1 .. n step 2).sum()
}