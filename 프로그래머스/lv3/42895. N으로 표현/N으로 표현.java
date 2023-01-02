import java.util.HashSet;

class Solution {
    public static int solution(int N, int number) {
		int answer = -1;
		HashSet<Integer>[] set = new HashSet[9];
		int n = 0;

		if (N == number) {
			return 1;
		}

		for (int i = 1; i < 9; i++) {
			n = (n * 10) + N;
			set[i] = new HashSet<>();
			set[i].add(n);
		}

		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < i; j++) {

				for (Integer num1 : set[j]) {
					for (Integer num2 : set[i - j]) {
						set[i].add(num1 + num2);
						set[i].add(num1 - num2);
						set[i].add(num1 * num2);

						if (num2 != 0) {
							set[i].add(num1 / num2);
						}
						if (num1 != 0) {
							set[i].add(num2 / num1);
						}
					}
				}

				if (set[i].contains(number)) {
					return i;
				}
			}
		}

		return answer;
	}
}