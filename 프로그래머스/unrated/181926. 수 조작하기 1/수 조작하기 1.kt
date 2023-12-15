class Solution {
        fun solution(n: Int, control: String): Int = control.fold(n) {acc, c -> acc + if (c == 'w') 1 else if (c == 's') -1 else if (c == 'd') 10 else if (c == 'a') -10 else 0}
}