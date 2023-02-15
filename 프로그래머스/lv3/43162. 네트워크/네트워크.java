class Solution {
    static boolean[] visited;
	public static int solution(int n, int[][] computers) {
		visited = new boolean[computers.length];
		int answer = 0;

		for (int i = 0; i < computers.length; i++) {
			if (!visited[i]) {
				answer++;
				dfs(i, computers);
			}
		}
		return answer;
	}
	private static void dfs(int idx, int[][] computers) {
		visited[idx] = true;

		for (int i = 0; i < computers.length; i++) {
			if (!visited[i] && computers[idx][i] == 1) {
				dfs(i, computers);
			}
		}
	}
}