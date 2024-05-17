class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("\\D", "");
		int ans = 0;

		for (char c : my_string.toCharArray()) {
			ans += Character.getNumericValue(c);
		}

		return ans;
    }
}