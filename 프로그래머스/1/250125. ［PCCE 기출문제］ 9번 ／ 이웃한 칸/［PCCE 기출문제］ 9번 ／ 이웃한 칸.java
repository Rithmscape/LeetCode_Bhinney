class Solution {
    int[] mh = {0, 1, -1, 0};
    int[] mw = {1, 0, 0, -1};
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

		String color = board[h][w];
		for (int i = 0; i < 4; i++) {
			int nh = h + mh[i];
			int nw = w + mw[i];

			if (nh < 0 || nh >= board.length || nw < 0 || nw >= board[0].length) continue;
			if (color.equals(board[nh][nw])) answer++;
		}
		return answer;
    }
}