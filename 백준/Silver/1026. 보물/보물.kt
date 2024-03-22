fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val a = readLine().split(" ").map { it.toInt() }.sorted().toIntArray()
    val b = readLine().split(" ").map { it.toInt() }.sortedDescending().toIntArray();

    var ans = 0
    for (i in 0..< n) ans += a[i] * b[i]
    println(ans)
}