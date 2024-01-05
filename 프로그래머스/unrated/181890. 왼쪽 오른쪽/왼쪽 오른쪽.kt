class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        if (!str_list.contains("r") && !str_list.contains("l")) return emptyArray()

        val l_idx : Int = (str_list.indices).firstOrNull { i:Int -> str_list[i].equals("l") } ?: Int.MAX_VALUE
        val r_idx : Int = (str_list.indices).firstOrNull { i:Int -> str_list[i].equals("r") } ?: Int.MAX_VALUE

        return if (l_idx < r_idx) str_list.sliceArray(0 .. l_idx - 1) else str_list.sliceArray(r_idx + 1 .. str_list.lastIndex)
    }
}