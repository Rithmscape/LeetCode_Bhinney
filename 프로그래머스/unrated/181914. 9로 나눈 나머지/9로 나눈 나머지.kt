class Solution {
    fun solution(number: String): Int 
        = number.map(Char::digitToInt).sum() % 9
}