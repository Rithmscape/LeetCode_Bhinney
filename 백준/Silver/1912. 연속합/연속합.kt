import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }.toIntArray()
    val dp = IntArray(n) { Int.MIN_VALUE }
    dp[0] = arr[0]
    calculate(arr, dp, n - 1)
    println(dp.max())
}
private fun calculate(arr : IntArray, dp : IntArray, n : Int) : Int {
    if (dp[n] == Int.MIN_VALUE) 
        dp[n] = max(calculate(arr, dp, n - 1) + arr[n], arr[n])

    return dp[n]
}