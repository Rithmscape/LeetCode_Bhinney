import kotlin.math.round

fun main() = with(System.`in`.bufferedReader()) {
    var total = 0.0 // 총 학점
    var student = 0.0 // 학생 점수

    for (i in 1 .. 20) {

        // arr[0] : 과목명, arr[1] : 학점, arr[2] : 등급
        val arr = readLine().split(" ")

        // P는 계산에서 제외
        if (arr[2].equals("P")) continue

        total += arr[1].toDouble()
        student += (arr[1].toDouble() * score(arr[2]))
    }

    println(round(student / total * 1000000) / 1000000)
}

private fun score(rank : String) : Double {
    return when(rank) {
        "A+" -> 4.5
        "A0" -> 4.0
        "B+" -> 3.5
        "B0" -> 3.0
        "C+" -> 2.5
        "C0" -> 2.0
        "D+" -> 1.5
        "D0" -> 1.0
        else -> 0.0
    }
}