import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val arr = Array(3) {nextLong()}.toLongArray()
    println(arr.sum())
}