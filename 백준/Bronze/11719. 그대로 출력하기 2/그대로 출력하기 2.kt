fun main() = with(System.`in`.bufferedReader()) {
    var str = readLine()
    while (str != null) {
        println(str)
        str = readLine()
    }
}