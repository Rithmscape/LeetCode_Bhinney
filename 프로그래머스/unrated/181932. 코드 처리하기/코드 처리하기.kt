class Solution {
    fun solution(code: String): String {
        var answer = ""
        var mode = false

        for (i in code.indices) {
            if (mode) {
                if (code[i] == '1') mode = mode.not()
                else if (i % 2 != 0) answer += code[i]
            } else {
                if (code[i] == '1') mode = mode.not()
                else if (i % 2 == 0) answer += code[i]
            }
        }

        return if (answer.isNotEmpty()) answer else "EMPTY"
    }
}