class Solution {
    fun solution(a: Int, b: Int): Int = maxOf("$a$b".toInt(), 2 * a * b)
}