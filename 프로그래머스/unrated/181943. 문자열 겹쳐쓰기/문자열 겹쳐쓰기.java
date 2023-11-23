class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String ans = my_string.substring(0, s) + overwrite_string;

		return ans + my_string.substring(ans.length(), my_string.length());
    }
}