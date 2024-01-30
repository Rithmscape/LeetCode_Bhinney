class Solution {
    fun solution(arr: IntArray): IntArray = arr.flatMap { i -> List(i) {i} }.toIntArray()
}