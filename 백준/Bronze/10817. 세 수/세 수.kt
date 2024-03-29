fun main() = with(System.`in`.bufferedReader()) {
    val arr = readLine().split(" ").map {it.toInt()}.sorted()
    println(arr[1])
}