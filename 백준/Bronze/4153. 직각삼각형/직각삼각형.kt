fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        val arr = readLine().split(" ").map { it.toInt() }.sorted()
        if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break

        if (arr[2] * arr[2] == (arr[0] * arr[0] + arr[1] * arr[1])) println("right")
        else println("wrong")
    }
}