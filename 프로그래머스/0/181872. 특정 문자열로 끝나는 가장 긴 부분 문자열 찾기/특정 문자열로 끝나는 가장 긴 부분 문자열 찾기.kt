class Solution {
    fun solution(myString: String, pat: String): String
    = myString.substring(0, myString.lastIndexOf(pat) + pat.length)
}