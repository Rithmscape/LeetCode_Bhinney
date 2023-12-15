class Solution {
    fun solution(numLog: IntArray): String = (1..numLog.lastIndex).map {
        when (numLog[it] - numLog[it - 1]) {
            1 -> 'w'
            -1 -> 's'
            10 -> 'd'
            -10 -> 'a'
            else -> {}
        }
    }.joinToString("")
}