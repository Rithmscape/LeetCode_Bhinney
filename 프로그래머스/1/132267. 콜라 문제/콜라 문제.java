class Solution {
    public int solution(int a, int b, int n) {
        int ans = 0;

		/* 보유 중인 빈 병이 2개 미만이면, 콜라를 받을 수 없음 */
		if (n < 2) return ans;

		while (n >= a) {
			int c = n / a;

			ans += c * b;
			n -= c * a;
			n += c * b;
		}

		return ans;
    }
}