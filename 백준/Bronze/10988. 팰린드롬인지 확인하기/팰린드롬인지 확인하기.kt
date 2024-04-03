fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    if (isPalindrome(str)) println(1)
    else println(0)
}

private fun isPalindrome(str : String) : Boolean {
    val end = str.lastIndex
    for (i in 0 .. end / 2) {
        if (str[i] != str[end - i]) return false
    }
    return true
}