import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = n / 4
    val ans = "long ".repeat(m) + "int"
    println(ans)
}