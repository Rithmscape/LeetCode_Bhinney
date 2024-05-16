class Solution {
    fun solution(my_string: String): Int = my_string.filter(Char::isDigit).map { it.toString().toInt() }.sum()
}