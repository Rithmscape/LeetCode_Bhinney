class Solution {
    fun solution(myString: String): IntArray = myString.split("x").map { x -> x.length }.toIntArray()
}