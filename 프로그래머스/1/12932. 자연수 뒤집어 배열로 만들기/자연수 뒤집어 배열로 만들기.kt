class Solution {
    fun solution(n: Long): IntArray = n.toString().reversed().toCharArray().map { Character.getNumericValue(it) }.toIntArray()
}