fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    for (i in 0 .. str.lastIndex step 10) {
        if (i + 10 > str.length) println(str.substring(i, str.length))
        else println(str.substring(i, i + 10))
    }
}