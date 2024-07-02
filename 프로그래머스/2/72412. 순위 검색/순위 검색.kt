import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class Solution {
    val map = HashMap<String, ArrayList<Int>> ()
    fun solution(info: Array<String>, query: Array<String>): IntArray {
        info.forEach { dfs(it.split(" ").toTypedArray(), "", 0) }
        map.values.forEach { it.sort() }

        var answer = IntArray(query.size)
        for (i in query.indices) {
            answer[i] = binarySearch(query[i])
        }
        return answer
    }

    // map 에 모든 경우의 수의 키를 저장하기
    private fun dfs (info : Array<String>, str : String, depth : Int) {
        if (depth == 4) {
            val score = info[depth].toInt()
            if (map.containsKey(str))
                map[str]!!.add(score)
            else {
                val list = ArrayList<Int>()
                list.add(score)
                map[str] = list;
            }

            return
        }

        dfs(info, "$str-", depth + 1)
        dfs(info, str + info[depth], depth + 1)
    }

    // 이분 탐색을 통해 만족하는 인원 수 찾기
    // "java and backend and junior and pizza 100" -> {"java", "backend", "junior", "pizza 100"}
    // "- and backend and senior and - 150" -> {"-", "backend", "senior", "- 150"}
    private fun binarySearch (query: String) : Int {
        val arr = query.split(" and ")
        val score = arr[3].split(" ")[1].toInt()
        val q = arr[0] + arr[1] + arr[2] + arr[3].split(" ")[0];

        if (!map.containsKey(q))
            return 0

        val list = map[q]
        var start = 0
        var end = list!!.size

        while (start < end) {
            var mid = ((start + end) / 2 ).toInt()

            if (list.get(mid) >= score)
                end = mid
            else start = mid + 1
        }

        return list.size - start
    }
}