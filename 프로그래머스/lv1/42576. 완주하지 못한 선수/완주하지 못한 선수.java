import java.util.HashMap;

class Solution {
    public static String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> map = new HashMap<>();

		for (String s : participant) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		for (String s : completion) {
			map.put(s, map.getOrDefault(s, 0) - 1);
		}

		for (int i = 0; i < participant.length; i++) {
			if (map.get(participant[i]) > 0) {
				return participant[i];
			}
		}

		return "";
	}
}