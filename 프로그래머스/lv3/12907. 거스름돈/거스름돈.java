class Solution {
    public int solution(int n, int[] money) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        
        for (int c : money) {
            for (int i = 1; i < n + 1; i++) {
				if (i - c >= 0) {
					dp[i] += dp[i - c];
				}
			}
        }
        
        return dp[n];
    }
}