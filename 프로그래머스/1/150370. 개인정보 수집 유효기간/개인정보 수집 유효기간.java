import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int now = Integer.parseInt(today.split("\\.")[0]) * 336
			+ Integer.parseInt(today.split("\\.")[1]) * 28
			+ Integer.parseInt(today.split("\\.")[2]);

		// Map에 약관과 보관유효월을 저장
		Map<String, Integer> map = new HashMap<>();
		for (String t : terms) {
			String m = t.split(" ")[0];
			int time = Integer.parseInt(t.split(" ")[1]);
			map.put(m, time);
		}

		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < privacies.length; i++) {
			String p = privacies[i];
			String date = p.split(" ")[0];
			String type = p.split(" ")[1];
			int year = Integer.parseInt(date.split("\\.")[0]);
			int month = Integer.parseInt(date.split("\\.")[1]) + map.get(type);
			int day = Integer.parseInt(date.split("\\.")[2]) - 1;

			if (day <= 0) {
				day += 28;
				month -= 1;
			}

			if (month > 12){
				month -= 12;
				year += 1;
			}

			int tmp = year * 336 + month * 28 + day;
			if (now > tmp) ans.add(i + 1);
		}

		return ans.stream().mapToInt(n -> n).toArray();
    }
}