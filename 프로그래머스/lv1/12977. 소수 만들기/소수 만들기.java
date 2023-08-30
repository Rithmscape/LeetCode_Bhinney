class Solution {
    public static int solution(int[] num) {
		int ans = 0;
		for (int i = 0; i < num.length - 2; i++) {
			for (int j = i + 1; j < num.length - 1; j++) {
				for (int k = j + 1; k < num.length; k++) {
					int sum = num[i] + num[j] + num[k];

					if (isPrime(sum)) ans++;
				}
			}
		}

		return ans;
	}

	private static boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2 ; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}

		return true;
	}
}