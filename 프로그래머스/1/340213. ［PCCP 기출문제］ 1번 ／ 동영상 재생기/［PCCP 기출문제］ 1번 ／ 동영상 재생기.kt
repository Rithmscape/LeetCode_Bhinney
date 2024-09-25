class Solution {
    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {

        val videoLen = calculate(video_len)
        var time = calculate(pos)
        val opStart = calculate(op_start)
        val opEnd = calculate(op_end)

        // 현재 위치가 오프닝 구간에 있는 경우 오프닝 끝으로 이동
        if (time in opStart..opEnd) {
            time = opEnd
        }

        commands.forEach { cmd ->
            when (cmd) {
                "next" -> {
                    time += 10
                    if (time > videoLen) time = videoLen
                }
                "prev" -> {
                    time -= 10
                    if (time < 0) time = 0
                }
            }

            // prev 후에 오프닝 구간에 들어간 경우 오프닝 끝으로 이동
            if (time in opStart..opEnd) {
                time = opEnd
            }
        }

        return timeToString(time)
    }

    private fun calculate(time: String) = time.split(":").map { it.trim().toInt() }.let { (m, s) -> m * 60 + s }

    private fun timeToString(time: Int): String {
        val m = time / 60
        val s = time % 60
        return "%02d:%02d".format(m, s)
    }
}