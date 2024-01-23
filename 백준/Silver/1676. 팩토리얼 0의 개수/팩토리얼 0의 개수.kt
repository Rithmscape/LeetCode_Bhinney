import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var n = nextInt()
    var cnt = 0

    while (n >= 5) {
        cnt += n / 5
        n /= 5
    }

    println(cnt)
}