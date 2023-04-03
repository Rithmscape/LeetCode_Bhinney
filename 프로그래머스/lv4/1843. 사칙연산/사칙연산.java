class Solution {
    private static int[][] min;
	private static int[][] max;
	public static int solution(String[] arr) {
		int n = arr.length / 2 + 1;
		int[] list = new int[n];
		min = new int[n][n];
		max = new int[n][n];
		boolean opt = true;
		for (int i = 0; i < arr.length; i++) {
			String target = arr[i];
			if (target.equals("+") || target.equals("-")) {
				opt = target.equals("+");
			} else {
				if(opt) {
					list[i / 2] = Integer.parseInt(target);
				} else {
					list[i / 2] = -1 * Integer.parseInt(target);
				}
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				if (i == j) {
					min[i][j] = list[i];
					max[i][j] = list[i];
				} else {
					min[i][j] = Integer.MAX_VALUE;
					max[i][j] = Integer.MIN_VALUE;

					for (int k = i; k < j; k++) {
						boolean status = k == i;
						bfs(min[i][k], min[k + 1][j], i, j, status);
						bfs(min[i][k], max[k + 1][j], i, j, status);
						bfs(max[i][k], min[k + 1][j], i, j, status);
						bfs(max[i][k], max[k + 1][j], i, j, status);
					}
				}
			}
		}
		return max[0][n - 1];
	}

	public static void bfs(int a, int b, int x, int y, boolean status) {
		if (status && a < 0) {
			min[x][y] = Math.min(min[x][y], Math.min(a - b,a + b));
			max[x][y] = Math.max(max[x][y], Math.max(a - b,a + b));
		} else {
			min[x][y] = Math.min(min[x][y], a + b);
			max[x][y] = Math.max(max[x][y], a + b);
		}
	}
}