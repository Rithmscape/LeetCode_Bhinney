import java.util.Stack

class Solution {
    fun solution(plans: Array<Array<String>>): Array<String> {
        plans.sortWith { o1, o2 -> o1[1].compareTo(o2[1]) } // 시간순으로 정렬
        val answer = ArrayList<String>()
        val arr = toList(plans)
        val stack = Stack<Plan>()

        var curTime = -1
        for (i in arr.indices) {
            if (stack.isEmpty()) {
                stack.push(arr[i])
                continue
            }

            val curPlan = stack.peek()
            val newPlan = arr[i]
            curTime = curPlan.start

            if (curTime + curPlan.play <= newPlan.start) dfs(stack, newPlan, curTime, answer)
            else
                curPlan.play -= newPlan.start - curTime

            stack.push(newPlan)
        }

        while (!stack.isEmpty()) {
            answer.add(stack.pop().name)
        }

        return answer.toTypedArray()
    }

    private fun dfs(stack: Stack<Plan>, newPlan: Plan, curTime : Int, answer : ArrayList<String>) {
        if (stack.isEmpty()) return

        val curPlan = stack.peek()
        if (curTime + curPlan.play <= newPlan.start) {
            answer.add(stack.pop().name)
            dfs(stack, newPlan, curTime + curPlan.play, answer)
        }
        else
            curPlan.play -= newPlan.start - curTime
    }

    private fun toList(plans: Array<Array<String>>) : Array<Plan> {
        val arr = ArrayList<Plan>()

        for (i in plans.indices) {
            arr.add(Plan(plans[i][0], conversion(plans[i][1]), plans[i][2].toInt()))
        }

        return arr.toTypedArray()
    }

    private fun conversion(time : String) : Int {
        val hour = time.split(":")[0].toInt() * 60
        val minute = time.split(":")[1].toInt()
        return hour + minute
    }

    data class Plan (
        val name : String,
        val start : Int,
        var play : Int
    )
}