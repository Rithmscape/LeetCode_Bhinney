import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int ans = 0;

		/* 바구니 -> 스택 */
		Stack<Integer> stack = new Stack<>();
		stack.push(0);

		for (int m : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][m - 1] != 0) {
					if (stack.peek() == board[i][m - 1]) {
						stack.pop();
						ans += 2;
					} else {
						stack.push(board[i][m - 1]);
					}

					board[i][m - 1] = 0;
					break;
				}
			}
		}
		return ans;
    }
}