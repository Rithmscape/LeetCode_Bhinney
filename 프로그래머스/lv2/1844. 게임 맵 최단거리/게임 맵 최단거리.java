import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[] mx = {1, 0, -1, 0}; /* 동 서 남 북*/
	static int[] my = {0, 1, 0, -1};
	static int visited[][];
	public static int solution(int[][] maps) {
		int answer = 0;
		visited = new int[maps.length][maps[0].length];
		bfs(maps);
		answer = visited[maps.length-1][maps[0].length-1];
		if (answer == 0) {
			answer = -1;
		}

		return answer;
	}

	private static void bfs(int[][] maps) {
		int x = 0, y = 0;
		visited[x][y] = 1;

		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(x, y));

		while (!queue.isEmpty()) {
			Node cur = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = cur.x + mx[i];
				int ny = cur.y + my[i];

				if (nx < 0 || nx > maps.length - 1 || ny < 0 || ny > maps[0].length - 1)
					continue;

				if (visited[nx][ny] == 0 && maps[nx][ny] == 1) {
					visited[nx][ny] = visited[cur.x][cur.y] + 1;
					queue.add(new Node(nx, ny));
				}
			}
		}

	}

	private static class Node {
		int x;
		int y;

		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}