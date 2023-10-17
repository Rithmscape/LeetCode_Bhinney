import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> score = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			score.put(name[i], yearning[i]);
		}

		int[] answer = new int[photo.length];
		for (int i = 0; i < photo.length; i++) {
			int total = 0;
			for (String p : photo[i]) {
				if (!score.containsKey(p)) continue;

				total += score.get(p);
			}

			answer[i] = total;
		}

		return answer;
    }
}