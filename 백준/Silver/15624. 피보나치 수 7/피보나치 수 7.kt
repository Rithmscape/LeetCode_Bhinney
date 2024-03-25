import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val num = BigInteger.valueOf(1000000007L)
    val fibonacci = fibonacci(n, num)
    println(fibonacci[n])
}

private fun fibonacci(n : Int, num : BigInteger) : Array<BigInteger> {
    if (n == 0) return Array(1) { BigInteger.ZERO }

    val fibonacci = Array(n + 1) { BigInteger.ZERO }
    fibonacci[1] = BigInteger.ONE
    for (i in 2 .. n)
        fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % num

    return fibonacci
}