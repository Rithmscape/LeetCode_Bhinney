import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    val dp = Array(n + 1) {0L}
    dp[1] = 1L;
    for (i in 2 .. n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    println(dp[n])
}