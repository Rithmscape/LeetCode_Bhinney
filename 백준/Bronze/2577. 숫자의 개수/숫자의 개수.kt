import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val numbers = LongArray(3) { nextLong() }
    val multiply = (numbers[0] * numbers[1] * numbers[2]).toString()
    var count = IntArray(10)
    for (i in 0 ..< multiply.length) {
        count[multiply[i].digitToInt()]++
    }
    count.forEach { println(it) }
}