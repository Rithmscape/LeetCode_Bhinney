class Solution {
    fun solution(my_string: String): IntArray
        = (('A'..'Z').map { ch -> my_string.count { it == ch } } +
                ('a'..'z').map { ch -> my_string.count { it == ch } }).toIntArray()
}