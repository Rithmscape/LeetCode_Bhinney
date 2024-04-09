fun main() = with(System.`in`.bufferedReader()) {
    val arr = readLine().split(" ").map { it.toInt() }
    var cnt = 0
    for (i in 1 .. arr[0]) {
        if (arr[0] % i == 0) {
            cnt++
            if (cnt == arr[1]) println(i)
        }
    }

    if (cnt < arr[1]) println(0)
}