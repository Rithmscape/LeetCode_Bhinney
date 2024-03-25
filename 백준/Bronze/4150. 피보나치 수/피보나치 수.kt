import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    
    if (n == 0) println(BigInteger.ZERO)
    else if (n < 3) println(BigInteger.ONE)
    else {
        val fibonacci = fibonacci(n)
        println(fibonacci[n])
    }
}

private fun fibonacci(n : Int) : Array<BigInteger> {
    val fibonacci = Array(n + 1) { BigInteger.ZERO }
    fibonacci[1] = BigInteger.ONE
    fibonacci[2] = BigInteger.ONE
    for (i in 3 .. n)
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]

    return fibonacci
}