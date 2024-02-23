import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val s = next();
    val alphabet = IntArray(26);
    for (i in 0 ..< s.length) alphabet[s[i].code - 97]++;
    alphabet.forEach { print("$it ") }
}