import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = Array(5) { CharArray(15) {' '} }
    var max = 0
    for (i in 0 ..< 5) {
        val input = br.readLine()
        max = maxOf(max, input.length)
        arr[i] = input.toCharArray()
    }

    var ans = ""
    for (i in 0 ..< max) {
        for (j in 0 ..< 5) {
            if (arr[j].getOrNull(i) == null)
                continue
            ans += arr[j][i]
        }
    }

    println(ans)
}