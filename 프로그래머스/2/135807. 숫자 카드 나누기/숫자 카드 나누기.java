class Solution {
    public int solution(int[] a, int[] b) {
		// 조건 1. 철수가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고 영희가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수 a
		// 조건 2. 영희가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고, 철수가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수 a
		int a_gcd = gcd(a);
		int b_gcd = gcd(b);

		boolean check_a = check(a_gcd, b); // 조건 1 확인 -> true 여야 함
		boolean check_b = check(b_gcd, a); // 조건 2 확인 -> true 여야 함

		int ans = 0;
		if (check_a) ans = Math.max(ans, a_gcd);
		if (check_b) ans = Math.max(ans, b_gcd);
		return ans;
	}

	private int gcd(int[] arr) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			res = gcd(res, arr[i]);
		}

		return res;
	}

	private int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	private boolean check(int num, int[] arr) {
		if (num == 1) return false;
		for (int a : arr) {
			if (a % num == 0) return false;
		}

		return true;
	}
}