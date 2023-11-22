fun main(args: Array<String>) {
		val input = readLine()!!.split(' ')
    val s1 = input[0]
    val a = input[1]!!.toInt()
    
    println(s1.repeat(Math.max(0, a)))
}