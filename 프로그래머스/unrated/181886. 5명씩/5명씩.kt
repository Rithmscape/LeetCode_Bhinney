class Solution {
    fun solution(names: Array<String>): Array<String>
    = names.filterIndexed {idx, i -> idx % 5 == 0}.toTypedArray()
}