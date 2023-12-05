class Solution {
    fun solution(num_list: IntArray): IntArray = num_list.sortedArray().sliceArray(5 .. num_list.size - 1)
}