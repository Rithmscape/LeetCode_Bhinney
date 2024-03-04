fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    val dp = IntArray(n + 1) {0}
    val t = IntArray(n + 1) {0}

    for (i in 2 .. n) {
        dp[i] = dp[i - 1] + 1
        t[i] = i - 1

        if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
            dp[i] = dp[i / 2] + 1
            t[i] = i / 2
        }
        if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) {
            dp[i] = dp[i / 3] + 1
            t[i] = i / 3
        }
    }

    println(dp[n])

    val ans = StringBuilder()
    while (n > 0) {
        ans.append(n).append(" ")
        n = t[n]
    }
    println(ans.toString())
}