class Solution {
    fun solution(n: Int, m: Int): IntArray {
        val ans1 = gcp(n, m)
        val ans2 = (n * m) / ans1
        
        return intArrayOf(ans1, ans2)
    }
    
    private fun gcp(a : Int, b : Int) : Int = if (b != 0) gcp(b, a % b) else a
}