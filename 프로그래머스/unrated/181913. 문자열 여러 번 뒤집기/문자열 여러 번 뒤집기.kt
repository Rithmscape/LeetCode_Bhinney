class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var ans = my_string

        queries.forEach { (s, e) ->
            ans = ans.slice(0 until s) + ans.slice(s .. e)
                .reversed() + ans.slice(e + 1 .. ans.lastIndex)
        }

        return ans
    }
}