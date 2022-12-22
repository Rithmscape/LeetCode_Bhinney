class Solution {
    public int romanToInt(String s) {
        String[] roman = {"I", "V", "X", "L", "C", "D", "M"};
		String[] num = {"1 ", "5 ", "10 ", "50 ", "100 ", "500 ", "1000 "};

		for (int i = 0; i < roman.length; i++) {
			s = s.replace(roman[i], num[i]);
		}

		String[] arr = s.split(" ");

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i + 1 == arr.length) {
				sum += Integer.parseInt(arr[i]);
				continue;
			}

			int now = Integer.parseInt(arr[i]);
			int next = Integer.parseInt(arr[i + 1]);

			sum = now < next ? sum - now : sum + now;

		}

		return sum;
    }
}