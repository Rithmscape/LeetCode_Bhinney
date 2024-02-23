import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var str = br.readLine().split("-").toMutableList()
    br.close()

    for (i in 0 ..< str.size) {
        if (!str[i].contains("+")) continue

        val arr = str[i].split("+")
        var sum = arr[0].toInt()
        for (j in 1 ..< arr.size) {
            if (arr[j].equals("+")) continue
            sum += arr[j].toInt()
        }
        str[i] = sum.toString()
    }

    var ans = str[0].toInt()
    for (i in 1 ..< str.size) {
        ans -= str[i].toInt()
    }

    println(ans)
}