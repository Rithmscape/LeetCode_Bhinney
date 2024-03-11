import java.util.LinkedList
import java.util.Queue

fun main() = with(System.`in`.bufferedReader()) {
    val c = readLine().toInt()
    val n = readLine().toInt()
    val arr = Array (c + 1) { Array(c + 1) { false } }
    for (i in 0 ..< n) {
        val tmp = readLine().split(" ").map { it.toInt() }
        arr[tmp[0]][tmp[1]] = true
        arr[tmp[1]][tmp[0]] = true
    }

    solution(c, arr)
}

private fun solution(c : Int, arr : Array<Array<Boolean>>) {
    val queue : Queue<Int> = LinkedList()
    val visited = Array<Boolean>(c + 1) { false }
    visited[1] = true
    queue.offer(1)
    var ans = 0

    while (!queue.isEmpty()) {
        val t = queue.poll()

        for (i in arr.indices)
            if (!visited[i] && arr[t][i]) {
                queue.offer(i)
                visited[i] = true
                ans++
            }
    }

    println(ans)
}