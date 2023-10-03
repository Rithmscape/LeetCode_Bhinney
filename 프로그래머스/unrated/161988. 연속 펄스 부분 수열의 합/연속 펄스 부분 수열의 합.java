class Solution {
    public long solution(int[] sequence) {
        long a = -1, b = 1;

		long max = Integer.MIN_VALUE;
		long sumA = 0, sumB = 0, minA = 0, minB = 0;

		for (int i = 0; i < sequence.length; i++) {
			sumA += sequence[i] * a;
			sumB += sequence[i] * b;

			max = Math.max(max, sumA - minA);
			max = Math.max(max, sumB - minB);

			minA = Math.min(minA, sumA);
			minB = Math.min(minB, sumB);

			a *= -1;
			b *= -1;
		}

		return max;
    }
}