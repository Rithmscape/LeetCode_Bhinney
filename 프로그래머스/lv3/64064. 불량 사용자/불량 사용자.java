import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

class Solution {
    static Set<Set<String>> set;
	static List<List<String>> banList;
	public static int solution(String[] user, String[] banned) {
		set = new HashSet<>();
		banList = new ArrayList<>();

		for (String b : banned) {
			banList.add(getBannedList(b, user));
		}

		dfs(new HashSet<String>(), 0);

		return set.size();
	}

	private static List<String> getBannedList(String b, String[] user) {
		String p = b.replace("*", ".");
		List<String> list = new ArrayList<>();

		for (String u : user) {
			boolean isMatch = Pattern.matches(p, u);

			if (isMatch) list.add(u);
		}

		return list;
	}

	private static void dfs(HashSet<String> hs, int depth) {
		if (depth == banList.size()) {
			set.add(new HashSet<>(hs));
			return;
		}

		for (String u : banList.get(depth)) {
			if (!hs.contains(u)) {
				hs.add(u);
				dfs(hs, depth + 1);
				hs.remove(u);
			}
		}
	}
}