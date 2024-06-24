class Solution {
    fun solution(n: Long): Long = n.toString().toCharArray().map{Character.getNumericValue(it)}.sortedDescending().joinToString("").toLong()
}