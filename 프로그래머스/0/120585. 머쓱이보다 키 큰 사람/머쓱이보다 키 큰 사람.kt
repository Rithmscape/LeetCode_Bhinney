class Solution {
    fun solution(array: IntArray, height: Int): Int 
    = array.filter{ it > height }.size
}