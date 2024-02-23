import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var numbers = IntArray(5) { nextInt() }
    for (i in 0 .. 4) numbers[i] *= numbers[i]
    println(numbers.sum() % 10)
}