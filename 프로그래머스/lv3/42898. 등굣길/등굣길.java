class Solution {
    public static int solution(int m, int n, int[][] puddles) {
		int num = 1000000007;

		int[][] dp = new int[n + 1][m + 1];

		for (int i = 0; i < puddles.length; i++) {
			int num1 = puddles[i][0];
			int num2 = puddles[i][1];

			dp[num2][num1] = -1;
		}

		dp[1][1] = 1;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				if (dp[i][j] == -1) {
					dp[i][j] = 0;
					continue;
				}

				if (dp[i - 1][j] > 0) {
					dp[i][j] += dp[i - 1][j] % num;
				}
				if (dp[i][j - 1] > 0) {
					dp[i][j] += dp[i][j-1] % num;
				}
			}
		}

		return dp[n][m] % num;
	}
}