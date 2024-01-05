class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray
    = (num_list.sliceArray(n .. num_list.lastIndex)) + (num_list.sliceArray(0 .. n - 1))
}