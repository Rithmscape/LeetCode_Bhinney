class Solution {
    public static int solution(int[] stones, int k) {
		int ans = 0;
		int min = 1;
		int max = Integer.MAX_VALUE;

		while (min <= max) {
			int mid = (min + max) / 2;

			if (checkCross(stones, k, mid)) {
				min = mid + 1;
				ans = Math.max(ans, mid);
			} else max = mid - 1;
		}

		return ans;
	}

	private static boolean checkCross(int[] stones, int k, int mid) {
		int cnt = 0;

		for (int s : stones) {
			if (s - mid < 0) cnt++;
			else cnt = 0;

			if (cnt == k) return false;
		}

		return true;
	}
}