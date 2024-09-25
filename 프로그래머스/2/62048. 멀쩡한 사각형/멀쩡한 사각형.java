class Solution {
    public long solution(int w, int h) {
		long total = (long) w * h; // 정사각형의 총 개수
		long gcd = gcd(w, h); // 패턴 -> 최대 공약수 구하기

		return total - (((w / gcd) + (h / gcd) - 1) * gcd);
	}

	private long gcd(int num1, int num2) {
		if (num1 % num2 == 0) return num2;
		return gcd(num2, num1 % num2);
	}
}