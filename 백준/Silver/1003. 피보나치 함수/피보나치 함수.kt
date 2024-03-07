fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt() // 테스트 개수 (테스트 값 n -> 0 <= n <= 40)
    val arr = fibonacci()
    for (i in 0 ..< t) {
        val n = readLine().toInt()
        val zero = arr[n][0]
        val one = arr[n][1]

        println("$zero $one")
    }
}

fun fibonacci() : Array<IntArray> {
    val fibonacci = Array(41, {IntArray(2, {-1})})
    fibonacci[0][0] = 1 // n = 0, fibonacci(0) 호출 카운팅
    fibonacci[0][1] = 0 // n = 0, fibonacci(1) 호출 카운팅
    fibonacci[1][0] = 0
    fibonacci[1][1] = 1

   for (i in 2 .. 40) {
       if (fibonacci[i][0] == -1 || fibonacci[i][1] == -1) {
           fibonacci[i][0] = fibonacci[i - 1][0] + fibonacci[i - 2][0]
           fibonacci[i][1] = fibonacci[i - 1][1] + fibonacci[i - 2][1]
       }
   }

    return fibonacci
}