import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val str = input()
    solution(str)
}
private fun input() : String {
    val br = BufferedReader(InputStreamReader(System.`in`))
    return br.readLine()
}

private fun solution(str : String) {
    val ans = StringBuilder()
    for (i in 0 .. str.lastIndex) {
        val code = str[i].code
        if (code >= 65 && code <= 90) ans.append(str[i].lowercase())
        else if (code >= 97 && code <= 123) ans.append(str[i].uppercase())
    }

    println(ans.toString())
}