class Solution {
    static String[] possible = {"aya", "ye", "woo", "ma"};
	static String[] doubleString = {"ayaaya", "yeye", "woowoo", "mama"};
	public static int solution(String[] babbling) {
		int ans = 0;

		for (String b : babbling) {

			/* 연속된 발음은 할 수 없음 */
			if (b.contains(doubleString[0]) || b.contains(doubleString[1]) || b.contains(doubleString[2]) || b.contains(doubleString[3]) || b.length() == 0) {
				continue;
			}

			for (String p : possible) {
				b = b.replace(p, " ");
			}
			b = b.replace(" ", "");

			if (b.length() == 0) ans++;
		}

		return ans;
	}
}