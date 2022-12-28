class Solution {
   public static int solution(String t, String p) {
		int len = p.length();
		long number = Long.parseLong(p);
		int cnt = 0;

		for (int i = 0; i <= t.length() - len; i++) {
			long target = Long.parseLong(t.substring(i, i + len));
			if (target <= number) cnt++;
		}

		return cnt;
	}
}