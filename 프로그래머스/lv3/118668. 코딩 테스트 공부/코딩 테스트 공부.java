class Solution {
    public static int solution(int alp, int cop, int[][] problems) {
		int alp_goal = 0;
		int cop_goal = 0;

		for (int i = 0; i < problems.length; i++) {
			alp_goal = Math.max(alp_goal, problems[i][0]);
			cop_goal = Math.max(cop_goal, problems[i][1]);
		}

		if (alp_goal <= alp && cop_goal <= cop)
			return 0;

		if (alp_goal <= alp) alp = alp_goal;
		if (cop_goal <= cop) cop = cop_goal;

		int[][] dp = new int[alp_goal + 2][cop_goal + 2];

		for (int i = alp; i <= alp_goal; i++)
			for (int j = cop; j <= cop_goal; j++)
				dp[i][j]=Integer.MAX_VALUE;

		dp[alp][cop] = 0;

		for (int i = alp; i <= alp_goal; i++) {
			for (int j = cop; j <= cop_goal; j++) {
				dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + 1);
				dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j] + 1);

				for (int[] num : problems) {
					if (i >= num[0] && j >= num[1]){
						if (i + num[2] > alp_goal && j + num[3] > cop_goal)
							dp[alp_goal][cop_goal] = Math.min(dp[alp_goal][cop_goal], dp[i][j] + num[4]);
						else if (i + num[2] > alp_goal)
							dp[alp_goal][j + num[3]] = Math.min(dp[alp_goal][j + num[3]], dp[i][j] + num[4]);
						else if (j + num[3] > cop_goal)
							dp[i + num[2]][cop_goal] = Math.min(dp[i + num[2]][cop_goal], dp[i][j] + num[4]);
						else if (i + num[2] <= alp_goal && j + num[3] <= cop_goal)
							dp[i + num[2]][j + num[3]] = Math.min(dp[i + num[2]][j + num[3]], dp[i][j] + num[4]);
					}
				}
			}
		}

		return dp[alp_goal][cop_goal];
	}
}