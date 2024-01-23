import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    var cnt = 0

    for (i in 0 .. arr.lastIndex) {
        if (isPrime(arr[i])) cnt++
    }
    println(cnt)
}
private fun isPrime (num : Int): Boolean {
    if (num == 1) return false

    for (i in 2 .. sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }

    return true
}