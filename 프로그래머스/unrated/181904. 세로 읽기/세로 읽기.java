class Solution {
    public String solution(String my_string, int m, int c) {
        /*
         * "ihrhbakrfpndopljhygc" -> 20
         * (1, 2) + (2, 2) + (3, 2) + (4, 2) + (5, 2)
         * (0, 2) + (1, 2) + (2, 2) + (3, 2) + (4, 2)
         */
        
        StringBuilder ans = new StringBuilder();
		int len = my_string.length();

		for (int i = 0; i < len / m; i++) {
			String tmp = my_string.substring(0, m);

			ans.append(tmp.charAt(c - 1));

			my_string = my_string.substring(m);
		}

		return ans.toString();
    }
}