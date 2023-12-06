import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        ArrayList<ArrayList<Integer>> roads_list = new ArrayList<>();
		int[] ans = new int[sources.length];

		for (int i = 0; i < n + 1; i++) roads_list.add(new ArrayList<>());
		for (int[] r : roads) {
			roads_list.get(r[0]).add(r[1]);
			roads_list.get(r[1]).add(r[0]);
		}

		int[] dist = new int[n + 1];
		Arrays.fill(dist, -1); // 갈 수 없으면 -1
		dist[destination] = 0; // 도착 지점은 0

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{destination, 0});

		while (!q.isEmpty()) {
			int[] cur = q.poll();

			for (int next : roads_list.get(cur[0])) {
				if (dist[next] < 0) {
					dist[next] = cur[1] + 1;
					q.add(new int[]{next, cur[1] + 1});
				}
			}
		}

		for (int i = 0; i < ans.length; i++) {
			ans[i] = dist[sources[i]];
		}

		return ans;
    }
}