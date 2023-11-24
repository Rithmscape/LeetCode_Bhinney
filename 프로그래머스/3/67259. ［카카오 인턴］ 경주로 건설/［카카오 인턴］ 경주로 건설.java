import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] board) {
        int[] dy = {-1, 1, 0, 0}, dx = {0, 0, -1, 1}; // 방향
		int N = board.length;

		int[][][] cost = new int[N][N][4];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				Arrays.fill(cost[i][j], Integer.MAX_VALUE);
			}
		}

		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{0, 0, 0, 1});
		queue.add(new int[]{0, 0, 0, 3});

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();

			for (int i = 0; i < 4; i++) {
				int ny = cur[0] + dy[i];
				int nx = cur[1] + dx[i];
				int c = cur[2] + (cur[3] == i ? 100 : 600);

				if (ny < 0 || nx < 0 || ny >= N || nx >= N || board[ny][nx] == 1 || cost[ny][nx][i] <= c) continue;
				cost[ny][nx][i] = c;
				queue.add(new int[]{ny, nx, c, i});
			}
		}

		return Arrays.stream(cost[N - 1][N - 1]).min().orElse(0);
    }
}