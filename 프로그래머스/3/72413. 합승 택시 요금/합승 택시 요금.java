import java.util.*;

class Solution {
    static int[][] matrix;
	public static int solution(int n, int s, int a, int b, int[][] fares) {

		// 1. 인접 행렬 리스트를 생성
		matrix = new int[n + 1][n + 1];
		for (int[] f : fares) {
			int cost = f[2];
			matrix[f[0]][f[1]] = cost;
			matrix[f[1]][f[0]] = cost;
		}

		// 2. 다익스트라 이용
		int[] arr = func(s, n);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < n + 1; i++) {
			int[] alone = func(i, n);
			int cost = arr[i] + alone[a] + alone[b];
			min = Math.min(min, cost);
		}

		return min;
	}

	public static int[] func(int start, int n) {
		PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
		boolean[] visited = new boolean[n + 1];
		int[] distance = new int[n + 1];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[start] = 0;
		pq.add(new int[]{0, start});

		while (!pq.isEmpty()) {
			int[] cur = pq.poll();
			int x = cur[1];

			if (visited[x]) continue;

			visited[x] = true;

			for (int i = 1; i < n + 1; i++) {
				if (matrix[x][i] == 0) continue;

				if (distance[x] + matrix[x][i] < distance[i]) {
					distance[i] = distance[x] + matrix[x][i];
					pq.add(new int[]{distance[i], i});
				}
			}
		}

		return distance;
	}
}