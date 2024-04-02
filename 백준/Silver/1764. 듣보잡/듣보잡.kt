fun main() = with(System.`in`.bufferedReader()) {
    // arr[0] : 듣도 못한 사람 수, arr[1] : 보도 못한 사람 수
    val arr = readLine().split(" ").map { it.toInt() }
    val ans = mutableListOf<String>()
    val set = mutableSetOf<String>()
    repeat(arr[0]){ set.add(readLine()) }
    repeat(arr[1]){
        val str = readLine()
        if (set.contains(str)) ans.add(str)
    }

    println(ans.size)
    ans.sorted().distinct().forEach { println(it) }
}