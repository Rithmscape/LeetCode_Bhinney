class Solution {
    private static int answer;
	private static boolean[] visited;
	private static char[] arr;
	public static int solution(int n, String[] data) {
		arr = new char[] {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
		visited = new boolean[8];
		answer = 0;

		dfs("", data);

		return answer;
	}

	private static void dfs(String name, String[] data) {
		if (name.length() == 7) {

			if (check(name, data)) {
				answer++;
			}
			return;
		}

		for (int i = 0; i < 8; i++) { // 조합
			if (!visited[i]) {
				visited[i] = true;
				String names = name + arr[i];
				dfs(names, data);
				visited[i] = false;
			}
		}
	}

	private static boolean check(String name, String[] data) {
		for (String s : data) {
			int friend1 = name.indexOf(s.charAt(0));
			int friend2 = name.indexOf(s.charAt(2));
			char op = s.charAt(3);
			int idx = s.charAt(4) - '0';

			if (op == '=') {
				if (!(Math.abs(friend1 - friend2) == idx + 1)) {
					return false;
				}
			} else if (op == '>') {
				if (!(Math.abs(friend1 - friend2) > idx + 1)) {
					return false;
				}
			} else if (op == '<') {
				if (!(Math.abs(friend1 - friend2) < idx + 1)) {
					return false;
				}
			}
		}

		return true;
	}
}