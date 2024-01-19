import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var arr = Array(5) {nextInt()}
    for (i in 0 .. 4) if (arr[i] < 40) arr[i] = 40
    println(arr.average().toInt())
}