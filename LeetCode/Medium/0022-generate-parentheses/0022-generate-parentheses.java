import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();

		if (n == 0) {
			result.add("");
		}

		for (int c = 0; c < n; ++c) {
			for (String left: generateParenthesis(c)) {
				for (String right: generateParenthesis(n-1-c))
					result.add("(" + left + ")" + right);
			}
		}

		return result;
	}
}