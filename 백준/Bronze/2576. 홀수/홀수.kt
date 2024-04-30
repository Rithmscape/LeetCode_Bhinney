fun main() = with(System.`in`.bufferedReader()) {
    var min = Int.MAX_VALUE
    var sum = 0
    for (i in 1 .. 7) {
        val n = readLine().toInt()

        if (n % 2 == 0) continue
        else {
            sum += n
            min = minOf(min, n)
        }
    }

    if (sum == 0) println(-1)
    else {
        println(sum)
        println(min)
    }
}