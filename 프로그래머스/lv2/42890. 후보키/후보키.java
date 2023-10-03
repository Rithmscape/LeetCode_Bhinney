import java.util.HashSet;

class Solution {
    static HashSet<String> keySet;
	static String[][] rel;
	public static int solution(String[][] relation) {
		rel = relation;
		keySet = new HashSet<>();

		for (int i = 0; i < relation[0].length; i++) {
			boolean[] visited = new boolean[relation[0].length];
			dfs(0, 0, i, visited);
		}
        
        if (keySet.isEmpty()) return 1;

		return keySet.size();
	}

	private static void dfs(int idx, int cnt, int max, boolean[] visited) {
		if (cnt == max) {
			StringBuilder col = new StringBuilder();
			for (int i = 0; i < visited.length; i++) {
				if (visited[i]) {
					col.append(i);
				}
			}

			if (isPossible(col.toString(), visited)) {
				keySet.add(col.toString());
			}

			return;
		}

		if (idx >= visited.length) return;

		visited[idx] = true;
		dfs(idx + 1, cnt + 1, max, visited);

		visited[idx] = false;
		dfs(idx + 1, cnt, max, visited);
	}

	/* 희소성 확인 */
	private static boolean isPossible(String col, boolean[] visited) {
		for (String s : keySet) {
			boolean f = true;

			for (char c : s.toCharArray()) {
				if (!col.contains(c + "")) {
					f = false;
				}
			}

			if (f) return false;
		}

		HashSet<String> val = new HashSet<>();
		int[] name = new int[col.length()];
		int idx = 0;
		for (int i = 0; i < visited.length; i++) {
			if (visited[i]) {
				name[idx++] = i;
			}
		}

		StringBuilder value = new StringBuilder();
		for (String[] strings : rel) {
			value = new StringBuilder();

			for (int j = 0; j < col.length(); j++) {
				value.append(strings[name[j]]);
			}

			if (val.contains(value.toString()))
				return false;
			else
				val.add(value.toString());
		}

		return true;
	}
}