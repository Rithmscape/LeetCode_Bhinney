import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		backtrack(result, "", 0, 0, n );
		return result;
	}
	private static void backtrack (List<String> list, String str, int start, int end, int n) {

		if (str.length() == n * 2) {
			list.add(str);
			return;
		}

		if (start < n) {
			backtrack(list, str + "(", start + 1, end, n);
		}
		if (end < start) {
			backtrack(list, str + ")", start, end + 1, n);
		}
	}
}