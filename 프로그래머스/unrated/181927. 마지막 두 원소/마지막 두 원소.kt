class Solution {
    fun solution(num_list: IntArray): IntArray {
        val last = num_list[num_list.size - 1]
        val lastMinusOne = num_list[num_list.size - 2]
        return num_list + if (last > lastMinusOne) last - lastMinusOne else last * 2
    }
}