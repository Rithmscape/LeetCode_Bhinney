class Solution {
    fun solution(q: Int, r: Int, code: String): String
            = (r .. code.lastIndex step q).map { code[it] }.joinToString("")
}