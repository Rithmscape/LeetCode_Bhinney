fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    /*
    5 * 4 * 3 * 2 * 1
    2 * 1 * 3 * 2 * 1
    -----------------
    5 * 4
    2 * 1
    */

    var ans = 1
    repeat(k) { ans = ans * (n - it) / (it + 1) }
    println(ans)
}