import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        val n = readLine().toInt()

        if (n == -1) break
        val list = factor(n).sorted()
        val sum = list.sum()

        if (sum != n) println("$n is NOT perfect.")
        else {
            val ans = StringBuilder()
            ans.append(n).append(" = ")

            for (i in 0..< list.lastIndex)
                ans.append(list[i]).append(" + ")

            ans.append(list[list.lastIndex])
            println(ans)
        }
    }
}

private fun factor(n : Int) : List<Int>  {
    val set = HashSet<Int>()
    set.add(1)

    for (i in 2 .. sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            set.add(i)
            set.add(n / i)
        }
    }

    return set.toList()
}