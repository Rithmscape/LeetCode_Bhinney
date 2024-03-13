class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var distinct = arr.distinct().toIntArray()

        if (distinct.size == k) return distinct // 길이가 k 일때
        if (distinct.size > k) return distinct.sliceArray(0 until k) // k보다 길이가 길때
        
        var ans = IntArray(k) { -1 };
        for (i in 0 until distinct.size)
            ans[i] = distinct[i]

        return ans;
    }
}