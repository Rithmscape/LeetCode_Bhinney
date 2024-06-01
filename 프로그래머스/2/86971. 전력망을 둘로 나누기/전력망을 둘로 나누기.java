import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int n, int[][] wires) {
		/*
		2 <= n <= 100 && 자연수
		wires.length = n - 1 && 정수형 이차원 배열 -> wires[0] ~ wires[n - 2]
		*/
		boolean[][] arr = new boolean[n + 1][n + 1];

		for (int[] wire : wires) {
			arr[wire[0]][wire[1]] = true;
			arr[wire[1]][wire[0]] = true;
		}

		int answer = n;
		for (int[] wire : wires) {
			int v1 = wire[0];
			int v2 = wire[1];

			boolean[] visited = new boolean[n + 1];

			arr[v1][v2] = false;
			arr[v2][v1] = false;

			answer = Math.min(answer, bfs(v1, n, arr));

			arr[v1][v2] = true;
			arr[v2][v1] = true;
		}

		return answer;
	}

	private int bfs(int s,int n, boolean[][] arr) {
		boolean[] visited = new boolean[n + 1];
		int cnt = 1;

		Queue<Integer> queue = new LinkedList<>();
		queue.offer(s);

		while (!queue.isEmpty()) {
			int q = queue.poll();
			visited[q] = true;

			for (int i = 1; i <= n; i++) {
				if (visited[i]) continue;

				if (arr[q][i]) {
					queue.offer(i);
					cnt++;
				}
			}
		}

		return Math.abs(n - 2 * cnt);
	}
}