class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var ans = arr
        
        query.forEachIndexed { index, i ->
            ans = if (index % 2 == 0) ans.sliceArray(0 .. i) 
                else ans.sliceArray(i .. ans.lastIndex)
        }
        
        return ans
    }
}