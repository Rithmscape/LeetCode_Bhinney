fun main() = with(System.`in`.bufferedReader()) {
    val s = readLine().toLong()
    var sum = 0L
    var ans = 0L
    var num = 1L

    while (true) {
        sum += num
        if (sum > s) break
        num++
        ans++
    }

    println(ans)
}