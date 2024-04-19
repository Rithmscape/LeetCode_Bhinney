import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val minkook = readLine().split(" ").map { it.toInt() }.sum()
    val mansae = readLine().split(" ").map { it.toInt() }.sum()
    println(max(minkook, mansae))
}