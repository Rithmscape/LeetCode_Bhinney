class Solution {
    public int solution(int n, int[] stations, int w) {
        int ans = 0;
		int idx = 0;
		int apt = 1; // 1동 ~ n동

		while (apt <= n) {
			if (idx < stations.length && apt >= stations[idx] - w) {
				apt = stations[idx] + w + 1;
				idx += 1;
			} else {
				ans += 1;
				apt += w * 2 + 1;
			}
		}

		return ans;
    }
}