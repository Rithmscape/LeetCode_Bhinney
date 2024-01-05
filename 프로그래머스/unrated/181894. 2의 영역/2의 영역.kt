class Solution {
    fun solution(arr: IntArray): IntArray 
    = if (arr.contains(2)) arr.sliceArray(arr.indexOf(2) .. arr.lastIndexOf(2)) else intArrayOf(-1)
}