class Solution {
    fun solution(arr: IntArray, idx: Int): Int
    = (idx .. arr.lastIndex).firstOrNull { arr[it] == 1 } ?: -1
}