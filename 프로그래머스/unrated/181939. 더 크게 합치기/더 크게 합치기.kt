class Solution {
    fun solution(a: Int, b: Int): Int = maxOf("$a$b".toInt(), "$b$a".toInt())
}