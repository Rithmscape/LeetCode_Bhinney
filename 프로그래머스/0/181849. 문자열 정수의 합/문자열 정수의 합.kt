class Solution {
    fun solution(num_str: String): Int = num_str.toCharArray().map { it.digitToInt() }.sum()
}