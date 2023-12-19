class Solution {
    public int solution(int[][] board, int[][] skill) {
		int N = board.length;
		int M = board[0].length;

		int[][] sum = new int[N + 1][M + 1];
		for (int[] s : skill) {
			int r1 = s[1];
			int c1 = s[2];
			int r2 = s[3];
			int c2 = s[4];
			int degree = s[0] == 1 ? -1 * s[5] : s[5];

			sum[r1][c1] += degree;
			sum[r1][c2 + 1] += (degree * -1);
			sum[r2 + 1][c1] += (degree * -1);
			sum[r2 + 1][c2 + 1] += degree;
		}
		operate(N, M, sum);

		int answer = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (board[i][j] + sum[i][j] > 0) answer++;
			}
		}

		return answer;
	}

	private void operate(int N, int M, int[][] sum) {

		for (int y = 1; y < N; y++) {
			for (int x = 0; x < M; x++) {
				sum[y][x] += sum[y - 1][x];
			}
		}

		for (int x = 1; x < M; x++) {
			for (int y = 0; y < N; y++) {
				sum[y][x] += sum[y][x - 1];
			}
		}
	}
}