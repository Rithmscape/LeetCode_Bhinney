class Solution {
    public static int solution(int storey) {
		int answer = 0;

		String val = String.valueOf(storey);
		int[] ints = new int[val.length()];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = Character.getNumericValue(val.charAt(i));
		}

		for (int i = ints.length - 1; i >= 0; i--) {
			int num = ints[i];

			if (num == 10) {
				if (i - 1 < 0) {
					answer += 1;
					continue;
				}

				ints[i - 1]++;
				continue;
			}

			if (num >= 6) {
				answer += (10 - num);
				if (i - 1 < 0) {
					answer += 1;
					continue;
				}
				ints[i - 1]++;
			} else if (num <= 4) {
				answer += num;
			} else if (num == 5) {
				if (i - 1 < 0) {
					answer += 5;
					continue;
				} else {
					if (ints[i - 1] < 5) {
						answer += num;
					} else {
						answer += 5;
						ints[i - 1]++;
					}
				}
			}
		}

		return answer;
	}
}