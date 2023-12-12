class Solution {
    fun solution(num_list: IntArray): Int = num_list.filter { i -> i % 2 != 0 }.joinToString("").toInt() + num_list.filter { i -> i % 2 == 0 }.joinToString("").toInt()

}