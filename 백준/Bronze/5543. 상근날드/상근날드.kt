import kotlin.math.min

fun main () = with(System.`in`.bufferedReader()) {
    val sangduk = readLine().toInt()
    val joongduk = readLine().toInt()
    val haduk = readLine().toInt()
    val coke = readLine().toInt()
    val sprite = readLine().toInt()

    var sum = min(sangduk, min(joongduk, haduk))
    sum += min(coke, sprite)
    println(sum - 50)
}