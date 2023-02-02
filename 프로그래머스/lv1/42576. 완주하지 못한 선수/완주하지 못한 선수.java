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

		String answer = "";
		for (String s : map.keySet()) {
			if (map.get(s) > 0) {
				answer = s;
			}
		}

		return answer;
	}
}