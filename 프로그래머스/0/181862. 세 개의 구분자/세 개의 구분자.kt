class Solution {
    fun solution(myStr: String): Array<String> {
        val ans = myStr.split("[abc]+".toRegex()).filter { it.isNotEmpty() }.toTypedArray()
        return if (ans.isNotEmpty()) ans else arrayOf("EMPTY")
    }
}