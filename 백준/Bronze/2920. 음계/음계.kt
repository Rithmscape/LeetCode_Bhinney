fun main() = with(System.`in`.bufferedReader()) {
    val arr = readLine().split(" ").map { it.toInt() }.toIntArray()
    println(checking(arr))
}

private fun checking(arr: IntArray) : String {
    if (arr[0] != 8 && arr[0] != 1) return "mixed"

    else if (arr[0] == 1) {
        for (i in 1 .. arr.lastIndex) {
            if (arr[i] != arr[i - 1] + 1) return "mixed"
        }
        return "ascending"
    }

    else {
        for (i in 1 .. arr.lastIndex) {
            if (arr[i] != arr[i - 1] - 1) return "mixed"
        }
        return "descending"
    }
}