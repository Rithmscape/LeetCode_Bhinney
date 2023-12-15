class Solution {
    fun solution(arr: IntArray): IntArray {
        var i = 0
        val stk = mutableListOf<Int>()
        while (i < arr.size) {
            if (stk.isEmpty()) stk.add(arr[i++])
            else if (stk.last() < arr[i]) stk.add(arr[i++])
            else stk.removeLast()
        }
        return stk.toIntArray()
    }
}