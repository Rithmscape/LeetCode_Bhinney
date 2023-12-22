class Solution {
    fun solution(my_string: String): Array<String>
        = (0 .. my_string.lastIndex).map { idx -> my_string.substring(idx) }.sorted().toTypedArray()
}