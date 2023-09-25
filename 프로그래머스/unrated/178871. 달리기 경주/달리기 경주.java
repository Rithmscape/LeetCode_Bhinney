import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
       Map<String, Integer> runner = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			runner.put(players[i], i);
		}

		for (String c : callings) {
			int idx = runner.get(c);
			String ahead = players[idx - 1];

			players[idx] = ahead;
			players[idx - 1] = c;

			runner.put(ahead, idx);
			runner.put(c, idx - 1);
		}

		return players;
    }
}