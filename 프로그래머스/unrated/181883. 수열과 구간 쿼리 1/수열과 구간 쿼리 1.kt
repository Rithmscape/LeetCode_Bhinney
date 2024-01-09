class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray
    = arr.apply { queries.map { (s, e) -> (s .. e).forEach { arr[it]++ } } }
}