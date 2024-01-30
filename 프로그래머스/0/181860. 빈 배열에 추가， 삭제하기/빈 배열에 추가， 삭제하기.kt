import java.util.Stack

class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        val ans = Stack<Int>()
        for (i in arr.indices) {
            for (j in 0 .. (arr[i] * if (flag[i]) 2 else 1) - 1) {
                if (flag[i]) ans.push(arr[i]) else ans.pop()
            }
        }
        
        return ans.toIntArray()
    }
}