class Solution {
    public long[] solution(long[] numbers) {
        long[] ans = new long[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			String num = "0" + Long.toBinaryString(numbers[i]);
			int zero = num.lastIndexOf("0");
			int one = -1;

			for (int j = zero + 1; j < num.length(); j++) {
				if (num.charAt(j) == '1') {
					one = j;
					break;
				}
			}

			StringBuilder sb = new StringBuilder(num);
			if (zero != -1) {
				sb.setCharAt(zero, '1');
			}
			if (one != -1) {
				sb.setCharAt(one, '0');
			}

			ans[i] = Long.parseLong(sb.toString(), 2);
		}

		return ans;
    }
}