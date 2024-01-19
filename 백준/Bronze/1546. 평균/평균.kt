import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt() /* 총 점수의 개수 */
    var arr = Array(n) { nextInt().toDouble() }
    val max = arr.max()
    val sum = arr.sumOf { it / max * 100 }
    println(sum / n.toDouble() )
}