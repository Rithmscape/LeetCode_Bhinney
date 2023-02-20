class Solution {
    static boolean[] visited;
	static int max;
	public static int solution(int k, int[][] dungeons) {
		visited = new boolean[dungeons.length];
		max = 0;

		dfs(k, dungeons, 0);
		return max;
	}

	private static void dfs(int k, int[][] dungeons, int depth) {
		for (int i = 0; i < dungeons.length; i++) {
			if (!visited[i] && dungeons[i][0] <= k) {
				visited[i] = true;
				dfs(k - dungeons[i][1], dungeons, depth + 1);
				visited[i] = false;
			}
		}

		max = Math.max(max, depth);
	}
}