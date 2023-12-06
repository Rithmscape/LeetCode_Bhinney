class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var ans = 0
        when(ineq + eq) {
            ">=" -> ans = if (n >= m) 1 else 0
            ">!" -> ans = if (n > m) 1 else 0
            "<!" -> ans = if (n < m) 1 else 0
            "<=" -> ans = if (n <= m) 1 else 0
        }

        return ans
    }
}