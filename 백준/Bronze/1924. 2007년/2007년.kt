fun main() = with(System.`in`.bufferedReader()) {

    // arr[0] : x, arr[1] = y
    val arr = readLine().split(" ").map { it.toInt() }
    val months = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var count = 0
    for (x in 1 .. 12) {
        if (x == arr[0]) break
        count += months[x]
    }
    count += arr[1]

    val n = count % 7
    when (n) {
        0 -> println("SUN")
        1 -> println("MON")
        2 -> println("TUE")
        3 -> println("WED")
        4 -> println("THU")
        5 -> println("FRI")
        6 -> println("SAT")
    }
}