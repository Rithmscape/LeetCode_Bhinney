import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val answer = hashMapOf<Int, Int>()
        answer[a] = answer[a]?.plus(1) ?: 1
        answer[b] = answer[b]?.plus(1) ?: 1
        answer[c] = answer[c]?.plus(1) ?: 1
        answer[d] = answer[d]?.plus(1) ?: 1

        return when (answer.size) {
            1 -> 1111 * a
            2 -> {
                val p = answer.entries.firstOrNull { it.value == 3 }
                if (p != null) {
                    val q = answer.entries.first { it.value != 3 }.key
                    (10 * p.key + q) * (10 * p.key + q)
                } else {
                    val (q, p2) = answer.keys.toList()
                    (p2 + q) * abs(p2 - q)
                }
            }
            3 -> {
                val (q, r) = answer.entries.filter { it.value != 2 }.map { it.key }
                q * r
            }
            else -> answer.keys.minOrNull() ?: 1
        }
    }
}