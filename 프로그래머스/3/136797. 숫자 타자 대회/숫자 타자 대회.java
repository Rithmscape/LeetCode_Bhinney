import java.util.Arrays;

class Solution {
    /* [s, e]
	      0 1 2 3 4 5 6 7 8 9
	  0ㅣ 1 7 6 7 5 4 5 3 2 3
	  1ㅣ 7 1 2 4 2 3 5 4 5 6
	  2ㅣ 6 2 1 2 3 2 3 5 4 5
	  3ㅣ 7 4 2 1 5 3 2 6 5 4
	  4ㅣ 5 2 3 5 1 2 4 2 3 5
	  5ㅣ 4 3 2 3 2 1 2 3 2 3
	  6ㅣ 5 5 3 2 4 2 1 5 3 2
	  7ㅣ 3 4 5 6 2 3 5 1 2 4
	  8ㅣ 2 5 4 5 3 2 3 2 1 2
	  9ㅣ 3 6 5 4 5 3 2 4 2 1
	 */
	static int[][] cost = {
		{1, 7, 6, 7, 5, 4, 5, 3, 2, 3},
		{7, 1, 2, 4, 2, 3, 5, 4, 5, 6},
		{6, 2, 1, 2, 3, 2, 3, 5, 4, 5},
		{7, 4, 2, 1, 5, 3, 2, 6, 5, 4},
		{5, 2, 3, 5, 1, 2, 4, 2, 3, 5},
		{4, 3, 2, 3, 2, 1, 2, 3, 2, 3},
		{5, 5, 3, 2, 4, 2, 1, 5, 3, 2},
		{3, 4, 5, 6, 2, 3, 5, 1, 2, 4},
		{2, 5, 4, 5, 3, 2, 3, 2, 1, 2},
		{3, 6, 5, 4, 5, 3, 2, 4, 2, 1}
	};

	static int[][][] dp;

	public static int solution(String numbers) {
		dp = new int[numbers.length() + 1][10][10];
		for (int[][] ints : dp) {
			for (int i = 0; i < 10; i++) {
				Arrays.fill(ints[i], -1);
			}
		}

		return dfs(0, 4, 6, numbers);
	}

	private static int dfs(int ind, int L, int R, String numbers) {
		if (ind == numbers.length()) return 0;

		if (dp[ind][L][R] != -1) return dp[ind][L][R];

		int target = numbers.charAt(ind) - '0';
		int res = Integer.MAX_VALUE;

		if (target != R) res = Math.min(dfs(ind + 1, target, R, numbers) + cost[L][target], res);
		if (target != L) res = Math.min(dfs(ind + 1, L, target, numbers) + cost[R][target], res);

		return dp[ind][L][R] = res;
	}
}