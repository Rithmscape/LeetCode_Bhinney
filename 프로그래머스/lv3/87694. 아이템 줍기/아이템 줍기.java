import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[] mx = {1, -1, 0, 0};
	static int[] my = {0, 0, 1, -1};
	static Boolean[][] map;
	private static class Node {
		int x;
		int y;
		int cnt;

		public Node(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
	public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
		map = new Boolean[102][102];

		characterX *= 2;
		characterY *= 2;
		itemX *= 2;
		itemY *= 2;

		for (int[] nowRec : rectangle) {
			for (int j = 0; j < 4; j++)
				nowRec[j] *= 2;

			for (int x = nowRec[0]; x <= nowRec[2]; x++) {
				for (int y = nowRec[1]; y <= nowRec[3]; y++) {
					map[x][y] = (x == nowRec[0] || x == nowRec[2] ||
						y == nowRec[1] || y == nowRec[3]) && map[x][y] != Boolean.FALSE;
				}
			}

		}

		Queue<Node> queue = new LinkedList<>();

		map[characterX][characterY] = false;
		queue.offer(new Node(characterX, characterY, 0));

		int min = Integer.MAX_VALUE;

		while(!queue.isEmpty()) {
			Node node = queue.poll();

			if(node.x == itemX && node.y == itemY && min > node.cnt) {
				min = node.cnt;
				continue;
			}

			for(int i = 0; i < 4; i++) {
				int x = node.x + mx[i], y = node.y + my[i];
				if(x < 2 || y < 2 || x > 100 || y > 100) continue;
				if(map[x][y] != Boolean.TRUE) continue;

				map[x][y] = false;
				queue.offer(new Node(x, y, node.cnt + 1));
			}


		}

		return min / 2;
	}
}