fun main(args: Array<String>) {
    val s1 = readLine()!!
    for (s in s1) {
        if (s in 'a'..'z') print(s - 32)
        else print(s + 32)
    }
}