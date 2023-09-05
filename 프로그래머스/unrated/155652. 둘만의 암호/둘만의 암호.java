class Solution {
    public static String solution(String s, String skip, int index) {
		StringBuilder ans = new StringBuilder();

		for (char c : s.toCharArray()) {
			for (int i = 0; i < index; i++) {
				c += 1;

				if (c > 'z') {
					c -= 26;
				}

				if (skip.contains(String.valueOf(c))) {
					i--;
				}
			}

			ans.append(c);
		}
		return ans.toString();
	}
}