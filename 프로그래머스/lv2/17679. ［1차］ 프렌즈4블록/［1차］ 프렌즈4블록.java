class Solution {
    public static int solution(int m, int n, String[] b) {
		int ans = 0;

		/* String 배열을 char 배열로 바꾸어 사용하기 */
		char[][] board = new char[m][n];
		for (int i = 0; i < m; i++) {
			board[i] = b[i].toCharArray();
		}

		while (true) {

			/* 블럭들을 체크한 후, 2*2에 해당하는 같은 모양의 블럭이 있으면 제거하기 */
			int cnt = checkBlock(m, n, board);
			if (cnt == 0) break;
			ans += cnt;

			/* 블럭들을 떨어뜨리기 */
			dropBlock(m, n, board);
		}

		return ans;
	}

	private static int checkBlock(int m, int n, char[][] board) {
		int cnt = 0;
		boolean[][] visited = new boolean[m][n];

		for (int i = 0; i < m - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (board[i][j] == '.') continue;
				isFourBlock(board, visited, i, j);
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (visited[i][j]){
					cnt++;
					board[i][j] = '.';
				}
			}
		}
		return cnt;
	}

	private static void isFourBlock(char[][] board, boolean[][] visited, int i, int j) {
		char block = board[i][j];

		for (int a = i; a < i + 2 ; a++) {
			for (int b = j; b < j + 2; b++) {
				if (board[a][b] != block) return;
			}
		}

		for (int a = i; a < i + 2; ++a) {
			for (int b = j; b < j + 2; ++b) {
				visited[a][b] = true;
			}
		}
	}

	private static void dropBlock(int m, int n, char[][] board){
		for(int j = 0 ; j < n ; j++) {
			for(int i = m - 1 ; i >= 0 ; i--) {
				if(board[i][j] == '.') {
					for(int ni = i - 1 ; ni >= 0 ; ni--) {
						if(board[ni][j] != '.') {
							board[i][j] = board[ni][j];
							board[ni][j] = '.';
							break;
						}
					}
				}
			}
		}
	}
}