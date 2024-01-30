class Solution {
    public int solution(String myString, String pat) {
        int ans = 0;

		for (int i = 0; i <= myString.length() - pat.length(); i++) {
			if (pat.equals(myString.substring(i, i + pat.length()))) ans++;
		}

		return ans;
    }
}