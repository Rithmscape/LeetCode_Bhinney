import java.util.Scanner
import kotlin.math.abs

fun main() = with(Scanner(System.`in`)) {
    val a = nextLong()
    val b = nextLong()
    println(abs(a - b))
}