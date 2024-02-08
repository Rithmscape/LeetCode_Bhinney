import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    for (i in 1 .. n) {
        val num = br.readLine().split(" ").map { it.toInt() }
        println((num[0] * num[1]) / gcd(num[0], num[1]))
    }
}

private fun gcd(n : Int, m : Int): Int = if (m != 0) gcd(m, n % m) else n