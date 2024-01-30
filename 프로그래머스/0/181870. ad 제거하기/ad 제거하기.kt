class Solution {
    fun solution(strArr: Array<String>): Array<String>
    = strArr.filter { s -> !s.contains("ad") }.toTypedArray()
}