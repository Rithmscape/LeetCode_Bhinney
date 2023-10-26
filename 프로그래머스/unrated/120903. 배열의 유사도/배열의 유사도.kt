class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0

        for (i : Int in 0 .. s1.size - 1) {
            if (s2.contains(s1[i])) answer++;
        }

        return answer
    }
}