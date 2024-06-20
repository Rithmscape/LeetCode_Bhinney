import kotlin.math.sqrt

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for (i in left..right) 
            answer += if (i % sqrt(i.toDouble()) == 0.0) -i else i
        return answer
    }
}