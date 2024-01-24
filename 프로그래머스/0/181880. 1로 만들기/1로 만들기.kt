class Solution {
    fun solution(num_list: IntArray): Int 
    = num_list.fold(0) { acc, num ->
        var cnt = 0
        var copy = num
        while (copy != 1) {
            cnt++
            copy /= 2
        }
        acc + cnt
    }
}