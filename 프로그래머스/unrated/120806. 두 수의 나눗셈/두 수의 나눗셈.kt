class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var a : Double = num1.toDouble() / num2.toDouble()
        var answer: Int = (a * 1000).toInt()
        return answer
    }
}