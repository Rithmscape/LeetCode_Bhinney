class Solution {
    public static int solution(int n) {
		int ans = 0;

		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) ans++;
		}
		return ans;
	}

	private static boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}

		return true;
	}
}