class Solution {
    fun solution(num_list: IntArray): IntArray {
        var a = num_list.filter { it % 2 == 0 }.count()
        var b = num_list.filter { it % 2 != 0 }.count()

        return intArrayOf(a, b)
    }
}