import kotlin.streams.toList

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        var str = readLine()
        if (str.equals("#")) break

        str = str.lowercase()
        str = str.replace("a", "&")
        str = str.replace("e", "&")
        str = str.replace("i", "&")
        str = str.replace("o", "&")
        str = str.replace("u", "&")

        val s = str.chars().toList().filter { it -> it == '&'.code }
        println(s.size)
    }
}