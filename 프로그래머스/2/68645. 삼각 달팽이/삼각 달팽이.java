class Solution {
    /*
	 * n = 1 -> 1
	 * n = 2 -> 3
	 * n = 3 -> 6
	 * n = 4 -> 10
	 * n = 5 -> 15
	 * n = 6 -> 21
	 * n = 7 -> 28
	 */
	/*
	 1
	 2  18
	 3  19  17
	 4  20  27  16
	 5  21  28  26  15
	 6  22  23  24  25  14
	 7  8   9   10  11  12  13
	*/

	public int[] solution(int n) {
		int[] ans = new int[n * (n + 1) / 2];
		int[][] arr = new int[n][n];

		/* 초기값 선언, (0, 0) -> 1이여야 함 */
		int x = -1, y = 0;
		int num = 1;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				/* 세로 */
				if (i % 3 == 0) {
					x++;
				} else if (i % 3 == 1) { /* 가로 */
					y++;
				} else { /* 대각선 */
					x--;
					y--;
				}

				arr[x][y] = num++;
			}
		}

		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				ans[idx] = arr[i][j];
				idx++;
			}
		}

		return ans;
	}
}