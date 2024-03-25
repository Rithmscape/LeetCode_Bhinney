import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val fibonacci = fibonacci()

    for (i in 1 .. t) {
        val arr = readLine().split(" ")
        val p = arr[0].toInt()
        val q = BigInteger.valueOf(arr[1].toLong())
        val ans = fibonacci[p].mod(q)
        println("Case #$i: $ans")
    }
}

private fun fibonacci() : Array<BigInteger> {
    val fibonacci = Array<BigInteger> (10001) { BigInteger.ZERO }
    fibonacci[1] = BigInteger.ONE
    for (i in 2 .. 10000) fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2])
    return fibonacci
}