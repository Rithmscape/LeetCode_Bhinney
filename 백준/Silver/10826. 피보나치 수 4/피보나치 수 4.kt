import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val fibonacci = fibonacci(n)
    println(fibonacci[n])
}

private fun fibonacci(n : Int) : Array<BigInteger> {
    val fibonacci = Array(10001) { BigInteger.ZERO }
    fibonacci[1] = BigInteger.ONE
    for (i in 2 .. 10000)
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]

    return fibonacci
}