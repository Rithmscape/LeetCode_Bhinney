class Solution {
    public String solution(String my_string, int[] indices) {
        String[] ans = my_string.split("");
        
		for (int i : indices) {
			ans[i] = "";
		}

		return String.join("", ans).replaceAll(" ", "");
    }
}