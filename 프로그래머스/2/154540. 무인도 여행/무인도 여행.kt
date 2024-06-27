import java.util.LinkedList

class Solution {
    fun solution(maps: Array<String>): IntArray {
        val arr = Array<CharArray> (maps.size) { charArrayOf() }
        for (i in 0 .. maps.lastIndex) {
            arr[i] = maps[i].toCharArray()
        }

        val visited = Array<Array<Boolean>> (maps.size) { Array<Boolean> (maps[0].length) { false } }
        var answer = ArrayList<Int>()
        for (i in 0 .. maps.lastIndex)
            for (j in 0 .. maps[0].lastIndex)
                if (!visited[i][j] && arr[i][j] != 'X')
                    answer.add(bfs(i, j, arr, visited))

        return if (answer.size != 0) answer.sorted().toIntArray() else intArrayOf(-1)
    }

    private fun bfs(x : Int, y : Int, arr : Array<CharArray>, visited : Array<Array<Boolean>>) : Int {
        val mx = intArrayOf(-1, 1, 0, 0)
        val my = intArrayOf(0, 0, -1, 1)

        var sum = 0
        val que = LinkedList<IntArray>()
        que.offer(intArrayOf(x, y))
        visited[x][y] = true

        while (!que.isEmpty()) {
            val cur = que.poll()
            val cx = cur[0];
            val cy = cur[1];

            sum += Character.getNumericValue(arr[cx][cy])

            for (i in 0 .. 3) {
                val nx = cx + mx[i];
                val ny = cy + my[i];

                if (nx < 0 || ny < 0 || nx > arr.lastIndex || ny > arr[0].lastIndex) continue
                if (!visited[nx][ny] && arr[nx][ny] != 'X') {
                    visited[nx][ny] = true
                    que.offer(intArrayOf(nx, ny))
                }
            }
        }

        return sum
    }
}