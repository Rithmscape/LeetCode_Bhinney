fun main() = with(System.`in`.bufferedReader()) {
    val arr = readLine()!!.split(" ").map { it.toInt() }
    val n = Array(arr[0]) { IntArray(arr[1]) }

    for (i in 0 until arr[0])
        n[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    for (i in 0 until arr[0]){
        val m = readLine()!!.split(" ").map { it.toInt() }
        for (j in 0 until arr[1]) n[i][j] += m[j]
    }

    for (i in 0 until arr[0]) println(n[i].joinToString(" "))
}