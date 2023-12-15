class Solution {
    fun solution(l: Int, r: Int): IntArray
        = (l..r).filter { it.toString().all { ch -> ch == '0' || ch == '5' } }.takeIf(List<Int>::isNotEmpty)?.toIntArray() ?: intArrayOf(-1)
}