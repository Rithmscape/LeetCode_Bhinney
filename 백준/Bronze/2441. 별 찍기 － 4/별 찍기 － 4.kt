fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    for (i in 1 .. n) {
        val s = StringBuilder()
        for (j in 1 ..< i)
            s.append(" ")

        for (j in i .. n)
            s.append("*")
        
        println(s)
    }
}