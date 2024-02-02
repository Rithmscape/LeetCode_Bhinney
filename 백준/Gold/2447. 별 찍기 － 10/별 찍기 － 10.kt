import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val arr = Array(n) {CharArray(n)}
    dfs(arr, 0, 0, n, false)
    for (i in 0 ..< n) {
        println(arr[i].joinToString(""))
    }
}

fun dfs(arr : Array<CharArray>, x : Int, y : Int, n : Int, blank : Boolean) {
    if (blank) {
        for (i in x..< x + n) {
            for (j in y..< y + n) arr[i][j] = ' '
        }
        return
    }

    if (n == 1) {
        arr[x][y] = '*'
        return
    }

    val len = n / 3
    var cnt = 0
    for (i in x..< x + n step len) {
        for (j in y..< y + n step len) {
            cnt++
            dfs(arr, i, j, len, cnt == 5)
        }
    }
}