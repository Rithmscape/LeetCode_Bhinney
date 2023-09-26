import java.util.*;

class Solution {
    public static String[] solution(String[] players, String[] callings) {
		Player[] runner = new Player[players.length];
		Map<String, Player> map = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			Player p = new Player(players[i], i);
			runner[i] = p;
			map.put(players[i], p);
		}

		for (String c : callings) {
			Player now = map.get(c);
			int nowRank = now.rank;
			Player ahead = runner[nowRank - 1];

			now.setRank(c, nowRank - 1);
			ahead.setRank(ahead.name, nowRank);

			runner[nowRank] = ahead;
			runner[nowRank - 1] = now;

			map.put(ahead.name,  ahead);
			map.put(c, now);
		}

		String[] ans = new String[players.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = runner[i].name;
		}

		return ans;
	}

	private static class Player {
		String name;
		int rank;

		public Player(String name, int rank) {
			this.name = name;
			this.rank = rank;
		}

		public String getName(int rank) {
			return name;
		}


		public void setRank(String name, int rank) {
			this.name = name;
			this.rank = rank;
		}
	}
}