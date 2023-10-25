class Solution {
    fun solution(n: Int): Int {
        var ans = 0
        
        for (i : Int in 1..n) {
            if (i % 2 == 0) ans += i
        }
        
        return ans
    }
}