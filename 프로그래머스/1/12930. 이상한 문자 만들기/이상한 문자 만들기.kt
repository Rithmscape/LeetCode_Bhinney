class Solution {
    fun solution(s: String): String {
        var arr = s.split(" ")
        var ans = StringBuilder()

        arr.forEach { str ->
            var string = ""
            str.forEachIndexed { index, c ->
                string += if (index % 2 == 0) c.uppercase() else c.lowercase()
            }
            
            ans.append(string).append(" ")
        }
        
        return ans.toString().substring(0, ans.lastIndex)
    }
}