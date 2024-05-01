fun main() = with(System.`in`.bufferedReader()) {
    val t = readln().toInt()
    for (i in 1 .. t) {
        val arr = readln().split(" ").map { it.toInt() }.sortedDescending()
        println(arr[2])
    }
}