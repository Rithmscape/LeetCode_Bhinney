import java.util.ArrayList;
import java.util.Collections;

class Solution {
   static boolean[] visited;
	static ArrayList<String> route;
	public static String[] solution(String[][] tickets) {
		visited = new boolean[tickets.length];
		route = new ArrayList<>();

		dfs("ICN", "ICN", tickets, 0);

		Collections.sort(route);
		return route.get(0).split(" ");
	}

	private static void dfs (String start, String arrive, String[][] tickets, int depth) {
		if (depth == tickets.length) {
			route.add(arrive);
		}

		for (int i = 0; i < tickets.length; i++) {
			if (start.equals(tickets[i][0]) && !visited[i]) {
				visited[i] = true;
				dfs(tickets[i][1], arrive + " " + tickets[i][1], tickets, depth + 1);
				visited[i] = false;
			}
		}
	}
}