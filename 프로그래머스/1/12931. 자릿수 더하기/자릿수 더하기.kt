class Solution {
    fun solution(n: Int): Int = n.toString().toCharArray().map { it.toString().toInt() }.sum()
}