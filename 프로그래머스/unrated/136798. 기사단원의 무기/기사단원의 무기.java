import java.util.stream.IntStream;

class Solution {
   static int[] weapon;
	public static int solution(int number, int limit, int power) {
		weapon = new int[number + 1];
		addDivisor(number);
		checkPower(limit, power);
		return IntStream.of(weapon).sum();
	}

	/* 약수의 개수를 리스트에 담아주기 */
	private static void addDivisor(int num) {
		for (int i = 1; i <= num; i++) {
			int cnt = 0;
			for (int j = 1; j * j <= i; j++) {
				if (j * j == i) {
					cnt += 1;
				} else if (i % j == 0) {
					cnt += 2;
				}
			}

			weapon[i] = cnt;
		}
	}

	/* 리스트에 리밋이 초과된 것이 있는지 체크 */
	private static void checkPower(int limit, int power) {
		for (int i = 0; i < weapon.length; i++) {
			if (weapon[i] > limit) {
				weapon[i] = power;
			}
		}
	}
}