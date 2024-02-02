import java.util.Scanner

fun main() {
    val numbers = scan()
    val dp = dp()
    for (i in numbers.indices) println(dp[numbers[i]])
}

fun scan(): IntArray = with(Scanner(System.`in`)) {
    val n = nextInt()
    val numbers = IntArray(n) {nextInt()}
    return numbers
}

fun dp() : IntArray {
    val dp = IntArray(11)
    dp[0] = 0
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    for (i in 4 .. 10) dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1]
    return dp
}