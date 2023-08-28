import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static ArrayList<ArrayList<Integer>> list;
	static boolean[] visited;
	public static int solution(int n, int[][] edge) {
		list = new ArrayList<>();
		visited = new boolean[n + 1];

		for (int i = 0; i < n + 1; i++) {
			list.add(i, new ArrayList<>());
		}

		for (int[] e : edge) {
			list.get(e[0]).add(e[1]);
			list.get(e[1]).add(e[0]);
		}


		return bfs();
	}

	private static int bfs() {
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		visited[1] = true;

		int cnt = 0;

		while (true) {
			Queue<Integer> tmp = new LinkedList<>();

			while (!q.isEmpty()) {
				int now = q.poll();
				for (int node : list.get(now)) {
					if (!visited[node]) {
						tmp.offer(node);
						visited[node] = true;
					}
				}
			}

			if (tmp.isEmpty()) break;
			q.addAll(tmp);
			cnt = tmp.size();
		}

		return cnt;
	}
}