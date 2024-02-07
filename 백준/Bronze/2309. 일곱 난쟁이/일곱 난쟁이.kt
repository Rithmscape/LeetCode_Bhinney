import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var arr = Array(9) { nextInt() }.sorted().toIntArray()
    var sum = arr.sum()
    var one = -1
    var two = -1

    breakLoop@for (i in 0 ..< 9) {
        for (j in 0 ..< 9) {
            if (i == j) continue

            if (sum - arr[i] - arr[j] == 100) {
                one = arr[i]
                two = arr[j]
                break@breakLoop
            }
        }
    }

    arr.filter { it != one && it != two }.forEach { println(it) }
}