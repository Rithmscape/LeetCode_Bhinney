class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        for (i in arr.lastIndex downTo 0 step 2) arr[i] += n
        return arr
    }
}