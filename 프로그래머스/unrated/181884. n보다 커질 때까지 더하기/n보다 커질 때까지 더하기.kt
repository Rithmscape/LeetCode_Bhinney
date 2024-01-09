class Solution {
    fun solution(numbers: IntArray, n: Int): Int
    = numbers.fold(0) { sum, num -> if (sum > n) return sum else num + sum }
}