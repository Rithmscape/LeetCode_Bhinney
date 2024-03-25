fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    for (i in 1 .. n) {
        val arr = readLine().split(",").map { it.toInt() }
        println(arr.sum())
    }
}