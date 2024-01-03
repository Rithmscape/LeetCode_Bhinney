class Solution {
    fun solution(my_string: String, indices: IntArray): String
    = my_string.filterIndexed { index, c -> index !in indices }
}