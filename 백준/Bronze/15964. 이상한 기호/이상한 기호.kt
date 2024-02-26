fun main() = with(System.`in`.bufferedReader()) {
    val arr = readLine().split(" ")
    println(calculate(arr[0].toInt(), arr[1].toInt()))
}

private fun calculate(a : Int, b : Int) : Int = (a + b) * (a - b)