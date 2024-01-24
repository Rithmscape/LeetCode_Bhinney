fun main() {
    var str = readln()
    while (str != "0") {
        if (isPalindrome(str)) println("yes") else println("no")
        str = readln()
    }
}
private fun isPalindrome(str : String): Boolean {
    var arr = str.toCharArray()
    var len = str.length
    for (i in 0 .. arr.lastIndex / 2) {
        if (arr[i] != arr[len - i - 1]) return false
    }
    return true
}