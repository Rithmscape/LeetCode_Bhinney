import kotlin.math.max

class Solution {
    fun solution(num_list: IntArray): Int
    = max(num_list.filterIndexed {index, i ->  index % 2 == 0 }.sum(), num_list.filterIndexed {index, i ->  index % 2 != 0 }.sum())
}