class Solution {
    public static int solution(int n, int k) {
		int cnt = 0;
		String s = Integer.toString(n, k);
		String[] target = s.split("0");

		for (int i = 0; i < target.length; i++) {
			if (target[i].equals("")) continue;
			long num = Long.parseLong(target[i]);
			if (is_Prime(num)) {
				cnt++;
			}
		}

		return cnt;
	}
	private static boolean is_Prime(long num) {
		if (num < 2) return false;
		if (num == 2) return true;

		for(int i = 2; i <= (int)Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}

		return true;
	}
}