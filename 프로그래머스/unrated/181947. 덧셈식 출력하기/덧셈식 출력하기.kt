fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    val c = a + b
    println("$a + $b = $c")
}