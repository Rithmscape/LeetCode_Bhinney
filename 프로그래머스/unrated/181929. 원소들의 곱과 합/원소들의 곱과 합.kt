import kotlin.math.pow

class Solution {
    fun solution(num_list: IntArray): Int {
        val sum = num_list.sum().toDouble().pow(2).toInt()
        val multiply = num_list.reduce { a, b ->  a * b}

        return if (sum > multiply) 1 else 0
    }
}