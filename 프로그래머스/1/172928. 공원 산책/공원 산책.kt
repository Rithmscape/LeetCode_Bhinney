class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        /*
         * park : 공원, routes : 로봇 강아지 수행 명령
         * 공원을 벗어나거나(조건 1) 장애물을 만나면(조건 2) 해당 명령을 무시하고 다음 명령 수행
         * [세로, 가로]
         * S : 시작, O: 이동 가능 경로, X : 장애물
         */

        // 동서남북 이동을 맵에 저장
        val move = HashMap<String, IntArray>()
        move["N"] = intArrayOf(-1, 0)
        move["S"] = intArrayOf(1, 0)
        move["E"] = intArrayOf(0, 1)
        move["W"] = intArrayOf(0, -1)

        // 시작점으로 answer 설정
        var answer: IntArray = intArrayOf(0, 0)
        for (i in 0 .. park.lastIndex)
            if (park[i].contains('S'))
                answer = intArrayOf(i, park[i].indexOf('S'))

        routes.forEach {
            val m = move[it.split(" ")[0]]
            val c = it.split(" ")[1].toInt()

            var row = answer[0]
            var column = answer[1]

            for (i in 1 .. c) {
                row += m!![0]
                column += m[1]

                if (row < 0 || column < 0 || row > park.lastIndex || column > park[0].lastIndex // 조건 1
                    || park[row][column] == 'X') {// 조건 2
                    row = answer[0]
                    column = answer[1]
                    break
                }
            }

            answer = intArrayOf(row, column)
        }

        return answer
    }
}