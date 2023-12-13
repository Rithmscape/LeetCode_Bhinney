class Solution {
    public int solution(int n, String control) {
        int ans = n;
		for (char c : control.toCharArray()) {
			switch (c) {
				case 'w' -> ans++;
				case 's' -> ans--;
				case 'd' -> ans += 10;
				case 'a' -> ans -= 10;
				default -> {}
			}
		}
		return ans;
    }
}