class Solution {
    fun solution(cards: IntArray): Int {
        val visited = BooleanArray (cards.size) { false } // 상자의 오픈 여부 확인

        var group1 = 0
        var group2 = 0

        for (i in cards.indices) {
           if (visited[i]) continue

            visited[i] = true
            val cnt = dfs(i, cards, visited)

            if (cnt > group1) {
                group2 = group1
                group1 = cnt
            } else if (cnt > group2) group2 = cnt
        }

        return group1 * group2
    }

    private fun dfs(idx : Int, cards: IntArray, visited : BooleanArray) : Int {
        var cnt = 1

        val next = cards[idx] - 1
        if (!visited[next]) {
            visited[next] = true
            cnt = dfs(next, cards, visited) + 1
        }

        return cnt
    }
}